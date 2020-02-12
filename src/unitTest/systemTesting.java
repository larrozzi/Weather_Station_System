package unitTest;

import org.junit.Test;

import dev.CurrentConditionsDisplay;
import dev.WeatherData;
import org.junit.Assert;


public class systemTesting {

	@Test
	public void shoulddisplayCurrentConditions() {
		WeatherData Wdata = new WeatherData(); //creates weather data object with new empty array
		CurrentConditionsDisplay liveMeteo = new CurrentConditionsDisplay(Wdata);
		Wdata.setMeasurements(50, 75, 9);
		
		 String expected=liveMeteo.display();
		
		Assert.assertEquals(expected, "Current conditions: 50.0 F degrees in the air and 75.0 F degrees on ground with 9.0 in pressure");
	}
}
