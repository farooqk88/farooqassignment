package homeassigment1;
import java.util.logging.Logger;


public abstract class exceldataprovider implements data {
	
	private static final Logger logger = Logger.getLogger(exceldataprovider.class.getName());
	
	@Override
	public String getData(String key) {
        // Implement logic to read data from Excel files
        logger.info("reading data from the excel");
        return "Excel Data";

}

}