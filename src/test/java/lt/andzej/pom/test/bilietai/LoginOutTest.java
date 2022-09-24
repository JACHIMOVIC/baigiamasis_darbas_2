package lt.andzej.pom.test.bilietai;

import lt.andzej.pom.pages.bilietai.LoginInAccountPage;
import lt.andzej.pom.pages.bilietai.LoginOutPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginOutTest extends TestBase {

    @BeforeTest
    public void setUp() {
        LoginOutPage.open();
    }
    @Test
    public void LoginOut() {
        String name = "andrejach";
        String password = "bilety1";
        String expectedResult = "andrejach";
        String actualResult ;

        LoginInAccountPage.clickButtonSlapukai();
        LoginInAccountPage.clickIconPrisijungti();
        LoginInAccountPage.enterValidName(name);
        LoginInAccountPage.enterValidPassword(password);
        LoginInAccountPage.buttonPrisijungti();
        LoginInAccountPage.sleep(5000);
        LoginOutPage.clickUser();
        LoginOutPage.clickButtonLogout();

        actualResult = LoginInAccountPage.showMessage();

        Assert.assertEquals(actualResult, expectedResult);

    }


}
