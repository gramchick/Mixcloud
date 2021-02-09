package com.studentapp.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(SerenityRunner.class)

public class Hramma_29 {
    @Managed
    WebDriver driver;


    @Test

    @Step
    @Given("^User goes to Mixcloud website$")
    public void user_goes_to_Mixcloud_website() throws Throwable {
        driver.get("https://www.mixcloud.com/");
        this.driver.manage().window().maximize();
    }

    @Step
    @When("^User find and click on the login button on page$")
    public void user_find_and_click_on_the_login_button_on_page() throws Throwable {
         driver.findElement(By.xpath("//*[contains(text(),'Login')]")).click();
        }

    @Step
    @When("^User enters valid username$")
    public void user_enters_valid_username () throws Throwable {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gramchick");
        }
    @Step
    @When("^User enters valid password$")
    public void user_enters_valid_password () throws Throwable {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        }
    @Step
    @When("^User clicks on the 'log in' button$")
    public void user_clicks_on_the_log_in_button () throws Throwable {
        driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
        Thread.sleep(3000);
    }
    @Step
    @Then("^User should be logged in succesfully$")
    public void user_should_be_logged_in_succesfully () throws Throwable {
        Thread.sleep(3000);
        WebElement gramchick=driver.findElement(By.xpath("//*[contains(text(), 'gramchick')]"));
        Assert.assertEquals(true,  gramchick.isDisplayed());
        }


    @Given("^User clicks on Search field$")
    public void user_clicks_on_Search_field () throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[2]/div/div[1]/div/input")).click();
        Thread.sleep(5000);}

    @Step
    @When("^User enters artist name in the Search field$")
    public void user_enters_artist_name_in_the_Search_field () throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[2]/div/div/div/input")).sendKeys("Martin Garrix");
        Thread.sleep(5000);}

    @Step
    @When("^User opens an artist's page$")
    public void user_opens_an_artist_s_page () throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[3]/div/div/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/div/div/span/a/p")).click();
        Thread.sleep(5000);}

    @Step
    @Then("^User adds an artist's track to favourites$")
    public void user_adds_an_artist_s_track_to_favourites () throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[@id='react-root']/div[1]/section[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/*[1]")).click();
        }

    @Step
    @When("^User goes to User profile$")
    public void user_goes_to_User_profile () throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[2]/div/div[3]/div[3]/div[1]/div/img")).click();
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[2]/div/div[3]/div[3]/div[2]/div/div/div[1]/a/p")).click();
    }


    @Step
    @When("^User finds added track$")
    public void user_finds_added_track () throws Throwable {
        Thread.sleep(5000);
        WebElement MG_Show=driver.findElement(By.xpath("//*[contains(text(), 'The Martin Garrix Show')]"));
        Assert.assertEquals(true,  MG_Show.isDisplayed());
                }

    @Step
    @Then("^User deletes an artist's page from Favourites$")
    public void user_deletes_an_artist_s_page_from_Favourites () throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[3]/div/div[3]/main/div[1]/div/div/div[1]/div/div/div/div[1]/span")).click();
        Thread.sleep(5000);
    }
}
