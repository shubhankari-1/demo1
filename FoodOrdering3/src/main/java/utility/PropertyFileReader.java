package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	private static Properties properties;
	static {
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
			properties.load(fis);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Reusable method to get property value
	public String getProperty(String key) {
		return properties.getProperty(key);

	}
}
