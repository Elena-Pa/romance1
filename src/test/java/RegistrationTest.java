
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTest extends BaseUI {

    @Test
    public void testRegistration() {
        String textGetStarted;
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);

// Explicit Wait In Selenium WebDriver
        wait.until(ExpectedConditions.visibilityOf(driver.findElement((Locators.TEXT_FIELD_PASSWORD))));

        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        wait.until((ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT)));

// Implicit Wait In Selenium WebDriver
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(Data.nickname);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        textGetStarted = driver.findElement(Locators.TEXT_GET_STARTED).getText();

        System.out.println("Text on the Register Page:  " + textGetStarted);
    }

}
