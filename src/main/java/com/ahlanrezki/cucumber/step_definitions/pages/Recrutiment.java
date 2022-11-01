package com.ahlanrezki.cucumber.step_definitions.pages;

import com.ahlanrezki.cucumber.step_definitions.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Recrutiment {
    private WebDriver driver;

    public Recrutiment() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
}
