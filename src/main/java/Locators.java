import org.openqa.selenium.By;

public class Locators {

    // SignIn
    public static final By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    // Search
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    // Media
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    // Registration
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By BUTTON_NEXT = By.xpath(("//button[@data-action='next-page'][text()='Next']"));
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("#password");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("input[name='data[nickname]']");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");
    public static final By DAY_SELECT_BUTTON = By.cssSelector("#daySelect");
    public static final By DAY_SELECT = By.xpath("//li[@data-handler='selectDay']//a[text()='2']");
    public static final By MONTH_SELECT_BUTTON = By.cssSelector("#monthSelect");
    public static final By MONTH_SELECT = By.xpath("//li[@data-handler='selectMonth']//a[text()='Mar']");
    public static final By YEAR_SELECT_BUTTON = By.cssSelector("#yearSelect");
    public static final By YEAR_SELECT = By.xpath("//li[@data-handler='selectYear']//a[text()='2000']");
    public static final By CHECKBOX = By.cssSelector("input#confirmation");
    // Main Page
    public static final By TEXT_UKRAINIAN_GIRLS = By.cssSelector("h1.text-uppercase");
    public static final By TEXT_FIND_YOUR_LOVE = By.xpath("//p[text()='FIND YOUR LOVE, YOUR WIFE, YOUR DREAM!']");
    public static final By LINK_HOW_WE_WORK = By.cssSelector("a[href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By LINK_GIFTS = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    public static final By LINK_TOURS_TO_UKRAINE = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    public static final By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    public static final By IFRAME = By.cssSelector("iframe[src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By IFRAME_BUTTON = By.cssSelector("button[class='ytp-large-play-button ytp-button']");

    // for https://www.computerhope.com/jargon/r/radiobut.htm Lesson 8
    public static final By RADIO_BUTTON = By.xpath("//input[@value='V1']");
    public static final By SEARCH_FROM_RADIO_BUTTON = By.xpath("//input[@value='V4']");

}
