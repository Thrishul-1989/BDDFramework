package commonfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DriverHelper {

    static HomePage objHomePage;
    public static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        launchBrowser();
    }

    public static void getURL(){

        switch (GlobalVariables.ENV.toUpperCase()) {

            case "QA1":
                GlobalVariables.URL = "https://www-qa1.safeway.com";
                break;
            case "QA2":
                GlobalVariables.URL = "https://www-qa2.safeway.com";
                break;
            case "UAT":
                GlobalVariables.URL="https://flipcart.com";
                break;

            default:
                System.out.println("no such environment selected");
                break;
        }

    }



    public static void launchBrowser() throws IOException, InterruptedException {

       // WebDriver driver = null;
        FileInputStream inputStream = new FileInputStream("config.properties");
        Properties prop = new Properties();
        prop.load(inputStream);

        String browser = prop.getProperty("browsertype");
        GlobalVariables.ENV=prop.getProperty("environment");
        getURL();
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        driver.get(GlobalVariables.URL);
        driver.manage().window().maximize();
        objHomePage=new HomePage();
        Thread.sleep(5000);
        objHomePage.clickOnAccept();



    }
}
