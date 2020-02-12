package testdrivendev;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import dev.Observer;
import dev.WeatherData;
import dev.Subject;
import dev.CurrentConditionsDisplay;

public class methodTesting {

	@Test
	public void methodAddObserversTest() {
		WeatherData Wdata = new WeatherData(); //creates weather data object with new empty array
		new CurrentConditionsDisplay(Wdata);
		
		ArrayList<Observer> Tobservers = Wdata.getObserversArray();
		
		Assert.assertEquals(Wdata.getObserversArray(), Tobservers);
		Assert.assertTrue( Wdata.getObserversArray().size()==1);
	}
	
	@Test
	public void methodDetachObserversTest() {
		WeatherData Wdata = new WeatherData(); //creates weather data object with new empty array
		CurrentConditionsDisplay liveMeteo = new CurrentConditionsDisplay(Wdata);
		//Observer o = liveMeteo;
		//Wdata.attachObserver(liveMeteo);
		Wdata.detachObserver(liveMeteo);

		Assert.assertFalse( Wdata.getObserversArray().size()==1);
		Assert.assertTrue( Wdata.getObserversArray().size()==0);
	}
	
	@Test //to do
	public void methodNotifyObserversTest() {
		WeatherData Wdata = new WeatherData(); //creates weather data object with new empty array
		CurrentConditionsDisplay liveMeteo = new CurrentConditionsDisplay(Wdata);

	//	Assert.assertTrue( Wdata.getAirTemp()==liveMeteo.getAirTemp());
		Wdata.setAirTemp(65);
		Wdata.setGroundTemp(95);
		Wdata.setPressure(5);
		
		Wdata.notifyObservers();
		Assert.assertTrue( Wdata.getAirTemp()==liveMeteo.getAirTemp());
		Assert.assertTrue( Wdata.getGroundTemp()==liveMeteo.getGroundTemp());
		Assert.assertTrue( Wdata.getPressure()==liveMeteo.getPressure());
	}
	
	@Test
	public void methodSetMeasurementsTest() {
		WeatherData Wdata = new WeatherData(); //creates weather data object with new empty array
		 new CurrentConditionsDisplay(Wdata);
		Wdata.setMeasurements(40, 55, 10);
		Assert.assertTrue( Wdata.getAirTemp()==40);
		Assert.assertTrue( Wdata.getGroundTemp()==55);
		Assert.assertTrue( Wdata.getPressure()==10);
	}
	
	public void methodCurrentConditionsDisplay() {
		WeatherData Wdata = new WeatherData();
		new CurrentConditionsDisplay(Wdata);
		Assert.assertFalse(Wdata.getObserversArray().isEmpty());		
	}
	
	public void observerShouldUpdatemeasuments() {
		WeatherData Wdata = new WeatherData(); //creates weather data object with new empty array
		CurrentConditionsDisplay liveMeteo = new CurrentConditionsDisplay(Wdata);
		
//		liveMeteo.setAirTemp(80);
//		liveMeteo.setGroundTemp(100);
//		liveMeteo.setPressure(12);
		
		liveMeteo.update(80,100,12);
		
		Assert.assertTrue( liveMeteo.getAirTemp()==80);
		Assert.assertTrue( liveMeteo.getGroundTemp()==100);
		Assert.assertTrue( liveMeteo.getPressure()==12);
	}
	
	public void observershoulDdisplay() {
		WeatherData Wdata = new WeatherData(); //creates weather data object with new empty array
		CurrentConditionsDisplay liveMeteo = new CurrentConditionsDisplay(Wdata);
		liveMeteo.display();
	}
	
}



	

