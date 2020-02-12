package unitTest;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import dev.Observer;
import dev.WeatherData;

public class weatherDataObjectTest {
	
	@Test
	public void shouldCreateWdataObject() {
		WeatherData Wdata = new WeatherData();
		ArrayList <Observer>observers = Wdata.getObserversArray();

		Assert.assertEquals(observers, Wdata.getObserversArray());
			
	}

}
