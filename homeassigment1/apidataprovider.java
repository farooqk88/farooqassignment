package homeassigment1;
import java.util.logging.Logger;

import java.util.logging.Logger;

public class apidataprovider implements data{
	
	private static final Logger logger = Logger.getLogger(apidataprovider.class.getName());

	@Override
	public String getData(String key) {
		logger.info("fetching data from api");
        return "api Data";
	}

}
