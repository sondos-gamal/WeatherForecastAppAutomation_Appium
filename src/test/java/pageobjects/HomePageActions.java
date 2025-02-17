package pageobjects;

import actions.Actions;
import io.appium.java_client.android.AndroidDriver;

public class HomePageActions {
    private Actions actions;

    public HomePageActions(AndroidDriver driver) {
        this.actions = new Actions(driver);
    }

    public void changeTemperatureUnit() {
        actions.click(HomePage.TEMPERATURE_UNIT_BUTTON);
    }

    public String getTemperatureUnit() {
        return actions.getText(HomePage.TEMPERATURE_VALUE);
    }

    public boolean isRainAndHumidityDisplayed() {
        return actions.isElementDisplayed(HomePage.RAIN_ICON) &&
                actions.isElementDisplayed(HomePage.HUMIDITY_ICON);
    }
}
