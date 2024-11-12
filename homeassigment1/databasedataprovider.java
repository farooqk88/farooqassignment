package homeassigment1;
import java.util.logging.Logger;

public class databasedataprovider implements data {
	
	private static final Logger logger = Logger.getLogger(databasedataprovider.class.getName());

	@Override
	public String getData(String key) {
		logger.info("readind data from database");
        return "database Data";
	}

}
