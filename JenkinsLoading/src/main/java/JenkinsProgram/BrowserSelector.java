package JenkinsProgram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Basepage{

    public void selectedBrowserLoading(String Browser)
    {
        if(Browser.equalsIgnoreCase("Firefox"))
            {
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                //driver.get(BaseURL);

            }else if(Browser.equalsIgnoreCase("Chrome"))
            {
                System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                //driver.get(BaseURL);
            }else if(Browser.equalsIgnoreCase("IE"))
            {
                System.setProperty("webdriver.ie.driver", "C:\\Soft\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                //driver.get(BaseURL);
            }
            else
            {
                System.out.println(" *****************       Please Enter the valid Browser Name    ******************** ");
            }


        }
    }