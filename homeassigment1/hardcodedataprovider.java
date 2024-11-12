package homeassigment1;

import java.util.logging.Logger;

public class hardcodedataprovider implements data{
	
	private static final Logger logger = Logger.getLogger(hardcodedataprovider.class.getName());

	@Override
	public String getData(String key) {
		logger.info("reading data from hardcoded");
        return "hardcode Data";
	}

}
