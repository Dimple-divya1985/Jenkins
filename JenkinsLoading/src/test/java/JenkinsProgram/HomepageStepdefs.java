package JenkinsProgram;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class HomepageStepdefs extends Basepage
{
    BrowserSelector browserSelector = new BrowserSelector();
    String browser,baseURL;

    @Given("^User is on facebook page$")
    public void userIsOnFacebookPage()  {
        browser = System.getProperty("Browser");
        System.out.println("Browser is " + browser);
        browserSelector.selectedBrowserLoading(browser);
        baseURL = System.getProperty("BaseURL");
        System.out.println("url is" + baseURL);
        driver.get(baseURL);

    }
    @When("^User fill valid login details$")
    public void user_fill_valid_login_details()  {
        driver.findElement(By.cssSelector("#email")).sendKeys("holiday123@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("pappu123");
    }

    @Then("^User should able to login on facebook page$")
    public void user_should_able_to_login_on_facebook_page() {
        driver.findElement(By.cssSelector("#loginbutton")).click();
        Assert.assertEquals("User is not Login,There is error in Assert checck in login","Confirm your email address",driver.findElement(By.cssSelector(".uiHeaderTitle")).getText());
        //driver.close();
    }


}
