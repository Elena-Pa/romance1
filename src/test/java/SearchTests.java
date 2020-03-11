
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTests extends BaseUI {

    String currentUrlSearch;

    @Test
    public void testURL() {

        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println("Current url is     " + currentUrlSearch);
        System.out.println("Search Page url is " + Data.EXPECTED_URL_SEARCH);

       // Assert.assertEquals(currentUrlSearch, Data.EXPECTED_URL_SEARCH);
        softAssert.assertEquals(currentUrlSearch, Data.EXPECTED_URL_SEARCH, "Url is wrong");
        WebElement dropdownListSortBy = driver.findElement((Locators.DROP_DOWN_LIST_SORT_BY));
        searchPage.getDropDownListByValue(dropdownListSortBy, "date_created");
        softAssert.assertAll();
    }


    @Test
    public void testSearchFromDropDownListByValue1(){
        driver.findElement(Locators.LINK_SEARCH).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Select select = new Select(driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY));
        select.selectByValue("name");
    }


    @Test
    public void testSearchFromDropDownListByText1(){
        driver.findElement(Locators.LINK_SEARCH).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Select select = new Select(driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY));
        select.selectByVisibleText("Views");
    }


    @Test
    public void testSearchFromDropDownListByIndex1(){
        driver.findElement(Locators.LINK_SEARCH).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Select select = new Select(driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY));
        select.selectByIndex(2);
    }


    @Test
    public void testSearchFromDropDownListByValue2(){
        driver.findElement(Locators.LINK_SEARCH).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, "name");
    }


    @Test
    public void testSearchFromDropDownListByText2(){
        driver.findElement(Locators.LINK_SEARCH).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByText(dropDownListSortBy, "Views");
    }


    @Test
    public void testSearchFromDropDownListByIndex2(){
        driver.findElement(Locators.LINK_SEARCH).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByIndex(dropDownListSortBy, 3);
    }

// LESSON 8
// Web elements:
// Radio Button

    // from https://www.computerhope.com/jargon/r/radiobut.htm
    @Test
    public void testRadioButtons(){
        if (!driver.findElement(Locators.RADIO_BUTTON).isSelected()) {
            System.out.println("This radio-button is already selected");
        } else {
            driver.findElement(Locators.SEARCH_FROM_RADIO_BUTTON).click();
        }
    }


// LESSON 10
// Hard and soft ASSERTIONS (expected result of tests)


    @Test
    public void validateAsserts() {

        Assert.assertEquals("Web", "Web is ");
        Assert.assertTrue(driver.findElement(Locators.LINK_GIFTS).isDisplayed(),"Wrong string: ");
        Assert.fail("Element is not displayed");
    }


    @Test
    public void validateAssertEqualsForStrings() {
        Assert.assertEquals("Web", "Web");
    }


// this test is possible but not popular in java test automation:
    @Test
    public void validateAssertTrue1() {
        boolean requirement = true;
        Assert.assertTrue(requirement);
    }


    @Test
    public void validateAssertTrue2() {
        Assert.assertTrue(driver.findElement(Locators.LINK_GIFTS).isDisplayed(), "Element is not selected");
    }


}
