package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePageActions;

public class TemperatureUnitTest extends TestBase {
    private HomePageActions home;

    @BeforeMethod
    public void setupTest() {
        home = new HomePageActions(driver);
    }

    @Test
    public void testChangeTemperatureUnit() {
        String initialUnit = home.getTemperatureUnit();
        home.changeTemperatureUnit();
        String updatedUnit = home.getTemperatureUnit();
        Assert.assertNotEquals(initialUnit, updatedUnit, "Temperature unit did not change!");
    }
}
