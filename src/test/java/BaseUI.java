
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseUI {
    //return name + RandomStringUtils.random(lenght,"");
    WebDriver driver;
    WebDriverWait wait;
    MainPage mainPage;
    SearchPage searchPage;


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        mainPage = new MainPage(driver, wait);
        searchPage = new SearchPage(driver, wait);

        driver.manage().window().maximize();
        driver.get(Data.mainUrl);
    }


    @AfterMethod
    public void afterAction() {

        driver.quit();
    }
}



