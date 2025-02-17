package assertions;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class Assertion {
        public static void assertText(AndroidDriver driver, String actual, String expected) {
            Assert.assertEquals(actual, expected, "Text does not match!");
        }

        public static void assertElementDisplayed(boolean isDisplayed, String elementName) {
            Assert.assertTrue(isDisplayed, elementName + " is not displayed!");
        }
    }

