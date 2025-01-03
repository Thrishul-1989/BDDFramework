import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    WebDriver driver;
    @Before
    public void setup(){
        driver=new ChromeDriver();
        driver.get("https://gmail.com");

    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @org.junit.Test
    public void myFirstTest(){
    System.out.println("myfirst testcase");
    }

    @org.junit.Test
    public void mySecondTest(){
        System.out.println("my second testcase");

    }
}
