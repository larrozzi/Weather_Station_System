package dev;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float airTemp;
	private float groundTemp;
	private float pressure;
	//private Subject weatherData;
	
	
	public CurrentConditionsDisplay(Subject weatherData) { //observer subscribes to weatherData
		//this.weatherData = weatherData;
		weatherData.attachObserver(this); //observer can get notified now
	}
	
	public float getAirTemp() {	return airTemp;}
	public float getGroundTemp() {return groundTemp;}
	public float getPressure() {return pressure;}
	public void setAirTemp(float airTemp) {	this.airTemp = airTemp;}
	public void setGroundTemp(float groundTemp) {this.groundTemp = groundTemp;}
	public void setPressure(float pressure) {this.pressure = pressure;}

	@Override
	public void update(float airTemp, float groundTemp, float pressure) {
		this.airTemp=airTemp;
		this.groundTemp=groundTemp;
		this.pressure=pressure;	
	}

	@Override
	public String display() {
	return	("Current conditions: "+airTemp+" F degrees in the air and "+ groundTemp+" F degrees on ground with "+ pressure+" in pressure");
		
	}	
}
