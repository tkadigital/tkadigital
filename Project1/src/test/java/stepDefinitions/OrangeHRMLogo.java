package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogo {

    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver=new ChromeDriver();
    }
    @When("I open OrangeHRM home Page")
    public void i_open_orange_hrm_home_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Then("I Verify logo present on page")
    public void i_verify_logo_present_on_page() {
      boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true, status);
    }
    @Then("I Verify login name & password on Login-page")
    public void i_verify_login_name_password_on_login_page() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }
    @And("Close chrome browser")
    public void close_chrome_browser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
