package dev;

import java.util.ArrayList;

public class WeatherData implements Subject{

	private ArrayList<Observer> observers;
	private float airTemp;
	private  float groundTemp; 
	private float pressure;
	
	public ArrayList<Observer> getObserversArray() {return observers;}
	public float getAirTemp() {return airTemp;}
	public float getGroundTemp() {return groundTemp;}
	public float getPressure() {return pressure;}
	
	public void setObservers(ArrayList<Observer> observers) {this.observers = observers;}
	public void setAirTemp(float airTemp) {this.airTemp = airTemp;}
	public void setGroundTemp(float groundTemp) {this.groundTemp = groundTemp;}
	public void setPressure(float pressure) {this.pressure = pressure;}
	
	//constructor tested
	public WeatherData() { 
		observers= new ArrayList<Observer>();
	}
	
	@Override
	public void attachObserver(Observer o) {
		 observers.add(o);
	}
	
	@Override
	public void detachObserver(Observer o) {
		int i= observers.indexOf(o);
		if(i>=0) {
		observers.remove(i);
		}
	}
	
	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(airTemp, groundTemp, pressure);
		}
	}
	
	public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float airTemperature, float groundTemperature, float pressure) {
        this.airTemp = airTemperature;
        this.groundTemp = groundTemperature;
        this.pressure = pressure;
        measurementsChanged();
    }
	
}
