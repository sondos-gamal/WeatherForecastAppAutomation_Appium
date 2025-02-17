package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
private static Properties properties;

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/java/resources/config.properties");
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
