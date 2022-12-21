package pages;

import com.ea.framework.base.BasePage;
import com.ea.framework.config.Settings;
import com.ea.framework.controls.elements.Button;
import com.ea.framework.controls.elements.TextBox;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage extends BasePage {

    @FindBy(how = How.NAME, using = "UserName")
    public TextBox txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    public TextBox txtPassword;

    @FindBy(how = How.CSS, using = "[class*='btn-default']")
    public Button btnLogin;

    public void Login(String userName, String password) {
        txtUserName.EnterText(userName);
        txtPassword.EnterText(password);
    }

    public void Login() {
        txtUserName.EnterText(Settings.UserName);
        txtPassword.EnterText(Settings.Password);
    }

    public HomePage ClickLogin() throws InterruptedException {
        btnLogin.WaitForVisible().Click();
        Thread.sleep(2000);
        return GetInstance(HomePage.class);
    }


}
