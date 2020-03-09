
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseUI {

    String currentUrlSearch;

    @Test
    public void testURL() {

        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println("Current url is     " + currentUrlSearch);
        System.out.println("Search Page url is " + Data.expectedUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
    }


    @Test
    public void testSearchFromDropDownListByValue1() throws InterruptedException {
        driver.findElement(Locators.LINK_SEARCH).click();
        Thread.sleep(3000);
        Select select = new Select(driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY));
        select.selectByValue("name");
        Thread.sleep(3000);
    }


    @Test
    public void testSearchFromDropDownListByText1() throws InterruptedException {
        driver.findElement(Locators.LINK_SEARCH).click();
        Thread.sleep(3000);
        Select select = new Select(driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY));
        select.selectByVisibleText("Views");
        Thread.sleep(3000);
    }


    @Test
    public void testSearchFromDropDownListByIndex1() throws InterruptedException {
        driver.findElement(Locators.LINK_SEARCH).click();
        Thread.sleep(3000);
        Select select = new Select(driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY));
        select.selectByIndex(2);
        Thread.sleep(3000);
    }


    @Test
    public void testSearchFromDropDownListByValue2() throws InterruptedException {
        driver.findElement(Locators.LINK_SEARCH).click();

        Thread.sleep(3000);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, "name");
        Thread.sleep(3000);
    }


    @Test
    public void testSearchFromDropDownListByText2() throws InterruptedException {
        driver.findElement(Locators.LINK_SEARCH).click();

        Thread.sleep(3000);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByText(dropDownListSortBy, "Views");
        Thread.sleep(3000);
    }


    @Test
    public void testSearchFromDropDownListByIndex2() throws InterruptedException {
        driver.findElement(Locators.LINK_SEARCH).click();

        Thread.sleep(3000);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByIndex(dropDownListSortBy, 3);
        Thread.sleep(3000);
    }


    // for https://www.computerhope.com/jargon/r/radiobut.htm Lesson 8
    @Test
    public void testRadioButtons() throws InterruptedException {
        if (!driver.findElement(Locators.RADIO_BUTTON).isSelected()) {
            System.out.println("This radio-button is already selected");
        } else {
            driver.findElement(Locators.SEARCH_FROM_RADIO_BUTTON).click();
            Thread.sleep(3000);
        }
    }

}
