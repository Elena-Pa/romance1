import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BaseAction {

    public MainPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void clickJoinButton() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }

    public void completeFirstPartOfRegistration() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(Locators.TEXT_FIELD_EMAIL).clear();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.EMAIL);

// Explicit Wait In Selenium WebDriver
        wait.until(ExpectedConditions.visibilityOf(driver.findElement((Locators.TEXT_FIELD_PASSWORD))));

        driver.findElement(Locators.TEXT_FIELD_PASSWORD).clear();
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.PASSWORD);

        wait.until((ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT)));
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void completeSecondPartOfRegistration() {

        // Implicit Wait In Selenium WebDriver
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

       //driver.findElement(Locators.BUTTON_NEXT).click();

        driver.findElement(Locators.TEXT_FIELD_PHONE).clear();
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.PHONE);

        //Generate Nick Name:
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).clear();
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(generateNewNumber(Data.NICKNAME, 5));

        driver.findElement(Locators.DAY_SELECT_BUTTON).click();
        driver.findElement(Locators.DAY_SELECT).click();


        driver.findElement(Locators.MONTH_SELECT_BUTTON).click();
        driver.findElement(Locators.MONTH_SELECT).click();


        driver.findElement(Locators.YEAR_SELECT_BUTTON).click();
        driver.findElement(Locators.YEAR_SELECT).click();

        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX);
        checkboxConfirmation.click();

    }
}
