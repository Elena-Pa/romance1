
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainPageTest extends BaseUI {

    boolean requirement = true;
    boolean requirement2 = false;


    String currentTextUkrainianGirls;
    String expectedTextUkrainianGirls;
    String currentTextFindYourLove;
    String expectedTextFindYourLove;
    String currentUrlBlog;
    String actualTitle;
    String currentUrlToursToUkraine;
    String currentUrlHowItWorks;
    String currentUrlGifts;


    @Test
    public void testHowItWorksPage() {
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
        currentUrlHowItWorks = driver.getCurrentUrl();
        System.out.println("Current url is " + currentUrlHowItWorks);
        Assert.assertEquals(currentUrlHowItWorks, Data.expectedUrlHowItWorks);
    }


    @Test
    public void testGiftsPage() {
        driver.findElement(Locators.LINK_GIFTS).click();
        currentUrlGifts = driver.getCurrentUrl();
        System.out.println("Current url is " + currentUrlGifts);
        Assert.assertEquals(currentUrlGifts, Data.expectedUrlGifts);
    }


    @Test
    public void testToursToUkrainePage() {
        driver.findElement(Locators.LINK_TOURS_TO_UKRAINE).click();
        currentUrlToursToUkraine = driver.getCurrentUrl();
        System.out.println("Current url is " + currentUrlToursToUkraine);
        Assert.assertEquals(currentUrlToursToUkraine, Data.expectedUrlToursToUkraine);
    }


    @Test
    public void testBlogPage() {
        driver.findElement(Locators.LINK_BLOG).click();
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println("Current url is " + currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
    }


    @Test
    public void testPageText1() {
        currentTextUkrainianGirls = driver.findElement(Locators.TEXT_UKRAINIAN_GIRLS).getText();
        System.out.println("Page Text:  " + currentTextUkrainianGirls);
        Assert.assertEquals(currentTextUkrainianGirls, expectedTextUkrainianGirls);
    }


    @Test
    public void testPageText2() {
        currentTextFindYourLove = driver.findElement(Locators.TEXT_FIND_YOUR_LOVE).getText();
        System.out.println("Page Text:  " + currentTextFindYourLove);
        Assert.assertEquals(currentTextFindYourLove, expectedTextFindYourLove);
    }


    @Test
    public void testTitle() {
        actualTitle = driver.getTitle();
        Assert.assertEquals(Data.expectedTitle, actualTitle);
    }


    @Test
    public void testIFrame() {
        WebElement ele = driver.findElement(By.cssSelector("iframe[src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']"));
        driver.switchTo().frame(ele);
        driver.findElement(By.cssSelector("button[class='ytp-large-play-button ytp-button']")).click();
    }

}


