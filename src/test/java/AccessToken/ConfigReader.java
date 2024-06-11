package AccessToken;


	
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class ConfigReader {

	    private static final String CONFIG_FILE_PATH = "config.properties";

	    private static Properties properties;

	    static {
	        properties = new Properties();
	        try {
	       
	            properties.load(new FileInputStream(CONFIG_FILE_PATH));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static String getBaseUrl(String environment) {
	        return properties.getProperty(environment + ".base_url");
	    }

	    public static void main(String[] args) {
	       
	        String devBaseUrl = getBaseUrl("dev");
	        String uatBaseUrl = getBaseUrl("uat");

	        System.out.println("Dev Base URL: " + devBaseUrl);
	        System.out.println("UAT Base URL: " + uatBaseUrl);
	    }
	}



