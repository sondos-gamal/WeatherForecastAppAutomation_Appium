package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePageActions;


public class RainHumidityTest extends TestBase {
    private HomePageActions home;

    @BeforeMethod
    public void setupTest() {
        home = new HomePageActions(driver);
    }

    @Test
    public void testRainAndHumidityDisplayed() {
        Assert.assertTrue(home.isRainAndHumidityDisplayed(),
                "Rain or Humidity icons missing for the next 6 hours!");
    }
}
