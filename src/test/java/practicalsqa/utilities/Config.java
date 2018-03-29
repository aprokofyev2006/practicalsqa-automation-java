package practicalsqa.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	private static Properties configFile;
	static{
	String path = "./src/test/resources/practicalsqa/test_data/configuration.properties";  
	
	FileInputStream inStream;
	try {
		inStream = new FileInputStream(path);
		configFile = new Properties();
		configFile.load(inStream);
		inStream.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	public static String getProperty(String key){
		if (configFile.containsKey(key))
		{
			return configFile.getProperty(key);
		}else{
			throw new RuntimeException("Key "+key+" is not present in properties file");
		}
		
	}
	
}
