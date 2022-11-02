package com.ahlanrezki.cucumber.step_definitions;

import com.ahlanrezki.cucumber.step_definitions.pages.Recruitment;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestRecruitment {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private Recruitment recruitment = new Recruitment();

    public TestRecruitment() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test case one
    @When("User click menu Recruitment")
    public void user_click_menus_recruitment() {
        recruitment.menuRecruitment();
        extentTest.log(LogStatus.PASS, "User click menu Recruitment");
    }

    @Then("User On Menu Recruitment")
    public void user_on_menu_recruitment() {
        Assert.assertEquals(recruitment.getTxtRecruitment(), "Recruitment");
        extentTest.log(LogStatus.PASS, "User On Menu Recruitment");
    }


    //Test case one
    @When("User select hiring manager name")
    public void user_select_hiring_manager_name() {
        recruitment.searchByHiringManager("Linda");
        extentTest.log(LogStatus.PASS, "User select hiring manager name");
    }

    @And("User click button search")
    public void user_click_button_search() {
        recruitment.BtnSearch();
        extentTest.log(LogStatus.PASS, "User click button search");
    }

    @Then("Data name Linda display by system")
    public void data_name_Linda_display_by_system() {
        Assert.assertEquals(recruitment.getTxtLinda(), ("Linda Jane Anderson"));
        extentTest.log(LogStatus.PASS, "Data name Linda display by system");
    }
}