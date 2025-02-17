package drivermanager;

import config.Config;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        if (driver == null) {
            try {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                caps.setCapability(MobileCapabilityType.APP, Config.getProperty("/home/dell/Downloads/weatherapp.apk"));
                caps.setCapability("appPackage", "com.wftab.weather.forecast");
                //caps.setCapability("appActivity", "MainActivity");
                caps.setCapability(MobileCapabilityType.NO_RESET, true);
                caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

                driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            } catch (MalformedURLException e) {
                throw new RuntimeException("Invalid Appium server URL", e);
            } catch (Exception e) {
                throw new RuntimeException("Failed to initialize Appium driver", e);
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
