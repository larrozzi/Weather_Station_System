package dev;

public class Mainexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData Wdata = new WeatherData(); //creates weather data object with new empty array
		CurrentConditionsDisplay liveMeteo = new CurrentConditionsDisplay(Wdata);
		Wdata.setMeasurements(50, 75, 9);
		liveMeteo.display();	
	}
}
