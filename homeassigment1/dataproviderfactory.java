package homeassigment1;

public class dataproviderfactory {
	

	public static data getDataProvider(datatype datatype) {
		
        
		switch (datatype) {
        
               
            case FAKER:
            	
                return new fakerdataprovider();
                
            case DATABASE:
            	
                return new databasedataprovider();
                
            case API:
            	
                return new apidataprovider();
                
            case HARDCODED:
            	
                return new hardcodedataprovider();
                
            default:
                throw new IllegalArgumentException("Unknown data source type");
        }
    }
}


