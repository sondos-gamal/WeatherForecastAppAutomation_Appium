package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePageActions;

public class TimeFormatTest extends TestBase {
    private HomePageActions home;

    @BeforeMethod
    public void setupTest() {
        home = new HomePageActions(driver);
    }

    @Test
    public void testChangeTimeFormat() {
        // Simulate time format change
        home.changeTemperatureUnit(); // Replace with correct method for time format

        // Validate the format changed
        Assert.assertTrue(home.getTemperatureUnit().contains("AM") || home.getTemperatureUnit().contains("PM"),
                "Time format did not change to 12-hour!");
    }
}
