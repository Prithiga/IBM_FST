package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.Random;



public class CommonUtil {

	public static String getRandomString() {
        
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 5) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	
public static String readProperties(String key) throws IOException{
	InputStream inputStream = null;
	String value=null;
    try {
        Properties properties = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        inputStream = loader.getResourceAsStream("configuration.properties");
        properties.load(inputStream);
        value=properties.getProperty(key);
        
    } finally {
        if (inputStream != null) {
            inputStream.close();
        }
    }
    return value;
}

}
