import org.testng.annotations.Test;

public class SignINTests extends BaseUI {

    int indexLinkSignIn = 0;

    @Test
    public void testSignIn() {
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();
    }
}
