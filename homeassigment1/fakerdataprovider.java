package homeassigment1;
import java.util.logging.Logger;

public class fakerdataprovider implements data {
	
	private static final Logger logger = Logger.getLogger(fakerdataprovider.class.getName());

	@Override
	public String getData(String key) {
		logger.info("readind data from faker");
        return "faker Data";
	}
	
	

}
