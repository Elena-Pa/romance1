import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseUI {

    WebDriver driver;
    WebDriverWait wait;


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();
        driver.get(Data.mainUrl);
    }


    @AfterMethod
    public void afterAction() {
        driver.quit();
    }

}



