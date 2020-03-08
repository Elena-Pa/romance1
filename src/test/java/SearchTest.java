
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
        import org.testng.annotations.Test;

public class SearchTest extends BaseUI {

    String currentUrlSearch;

    @Test
    public void testURL(){
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





    public void getDropDownListByIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void getDropDownListByText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void getDropDownListByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }

    @Test
    public void testSearchFromDropDownListByValue2() throws InterruptedException {
        driver.findElement(Locators.LINK_SEARCH).click();

        Thread.sleep(3000);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        getDropDownListByValue(dropDownListSortBy, "name");
        Thread.sleep(3000);
    }

    @Test
    public void testSearchFromDropDownListByText2() throws InterruptedException {
        driver.findElement(Locators.LINK_SEARCH).click();

        Thread.sleep(3000);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        getDropDownListByText(dropDownListSortBy, "Views");
        Thread.sleep(3000);
    }

    @Test
    public void testSearchFromDropDownListByIndex2() throws InterruptedException {
        driver.findElement(Locators.LINK_SEARCH).click();

        Thread.sleep(3000);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        getDropDownListByIndex(dropDownListSortBy, 3);
        Thread.sleep(3000);
    }

}
