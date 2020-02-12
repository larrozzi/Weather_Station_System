package unitTest;

import org.junit.Assert;
import org.junit.Test;
import dev.WeatherData;
import dev.CurrentConditionsDisplay;

public class CurrentConditionsDisplayObjectTest {

	@Test
	 public void CurrentConditionsDisplayObject(){
		WeatherData Wdata = new WeatherData();
		new CurrentConditionsDisplay(Wdata);
		Assert.assertFalse( Wdata.getObserversArray().size()==0);
		Assert.assertTrue( Wdata.getObserversArray().size()==1);
	}
}

