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
   public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
   public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
   public static final By TEXT_FIELD_NICKNAME = By.cssSelector("input[name='data[phone]']");
   public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");
   public static final By TEXT_GET_STARTED = By.xpath("//div[@id='third-registration-page'] //div[text()='Get started']");

// Main Page
   public static final By TEXT_UKRAINIAN_GIRLS = By.cssSelector("h1.text-uppercase");
   public static final By TEXT_FIND_YOUR_LOVE = By.xpath("//p[text()='FIND YOUR LOVE, YOUR WIFE, YOUR DREAM!']");
   public static final By LINK_HOW_WE_WORK = By.cssSelector("a[href='https://romanceabroad.com/content/view/how-it-works']");
   public static final By LINK_GIFTS = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
   public static final By LINK_TOURS_TO_UKRAINE = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
   public static final By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");






// Main Page
    private By pageTop = By.xpath("//div[@class='top']");
    private By homeLink = By.xpath("//nav[@id='mainNav']//a[@class='nav-link']");
    private By photosLink = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    private By howWeWoirkLink = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    private By youTubeImg  = By.xpath("//a[@href='https://www.youtube.com/channel/UCCmXAG1ToSyHymqYzzJcTfQ']");
    private By phoneLink = By.xpath("//a[contains(text(),'+1(888)599-7816')]");
    private By emailLink = By.xpath("//i[@class='fa fa-envelope-o fa-2x mb-3 sr-contact']");
    private By faceabookImg = By.xpath("//a[@href='']");
    private By requestTourInfo = By.xpath("//a[@target='_blank']");
    private By textMeetOurUkrainianBrides = By.xpath("section-heading text-white");
    private By signInButton = By.cssSelector("a#ajax_login_link");
    private By joinForFreeNowButton = By.cssSelector("show-registration-block");
    private By discauntAlert = By.cssSelector("div.discountalert");
//  Login Form
    private By signInButtonLoginPage = By.cssSelector("div#user_load_content978_content div.col-xs-12.after-form.tali");
    private By passwordFieldLoginPage = By.cssSelector("input#password.form-control");
    private By emailFieldLoginPage = By.cssSelector("input#email.form-control");
    private By labelEmailLoginPage = By.cssSelector("div#user_load_content978_content div.form-group label[for='email']");
    private By labelPasswordLoginPage = By.cssSelector("div#user_load_content978_content div.form-group label[for='password']");
    private By facebookButton = By.cssSelector("div#user_load_content981_content a[href='https://romanceabroad.com/users_connections/oauth_login/1']");
    private By forgotPasswordLink = By.cssSelector("a[href='https://romanceabroad.com/users/restore']");


}
