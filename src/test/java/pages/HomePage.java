package pages;

import com.ea.framework.base.BasePage;
import com.ea.framework.base.LocalDriverContext;
import com.ea.framework.controls.elements.HyperLink;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage extends BasePage {

    By linkLogin = By.linkText("Login");

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public HyperLink lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public HyperLink lnkEmployeeList;

    @FindBy(how = How.LINK_TEXT, using = "Manage Users")
    public HyperLink lnkManageUsers;

    @FindBy(how = How.XPATH, using = "//a[@title='Manage']")
    public HyperLink lnkUserName;

    public LoginPage ClickLogin() {
        //lnkLogin.WaitForVisible().click();
        LocalDriverContext.getRemoteWebDriver().findElement(linkLogin).click();
        return GetInstance(LoginPage.class);
    }
    public boolean IsLogin() {
        return lnkLogin.isDisplayed();
    }

    public String GetLoggedInUser() {
        return lnkUserName.getText();
    }

    public EmployeeListPage ClickEmployeeList() {

        lnkEmployeeList.WaitForVisible().Click();
        return GetInstance(EmployeeListPage.class);
    }

    public ManageUsersPage ClickManageUsers() {

        lnkManageUsers.WaitForVisible().Click();
        return GetInstance(ManageUsersPage.class);
    }
}
