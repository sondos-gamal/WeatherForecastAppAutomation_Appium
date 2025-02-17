package base;
import drivermanager.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
        protected AndroidDriver driver;

        @BeforeClass
        public void setUp() {
            driver = DriverManager.getDriver();
        }

        @AfterClass
        public void tearDown() {
            DriverManager.quitDriver();
        }
}


