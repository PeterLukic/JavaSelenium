package steps;


import com.ea.framework.base.Base;

import com.ea.framework.base.CurrentPageContext;
import com.ea.framework.utilities.CucumberUtil;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

import java.util.List;
import java.util.Map;


public class LoginSteps extends Base {

    @And("^I ensure application opened$")
    public void iEnsureApplicationOpened()  {
        CurrentPageContext.setCurrentPage(GetInstance(HomePage.class));
        Assert.assertTrue("The login page is not loaded", CurrentPageContext.getCurrentPage().As(HomePage.class).IsLogin());

    }


    @Then("^I click login link$")
    public void iClickLoginLink()  {
        //Navigation to Login Page
        CurrentPageContext.setCurrentPage(CurrentPageContext.getCurrentPage().As(HomePage.class).ClickLogin());

    }

    @When("^I enter UserName and Password$")
    public void iEnterUserNameAndPassword(List<List<String>> table) {
        Map<String, String> mapTable = CucumberUtil.TableDictionaryConverter(table);
        CurrentPageContext.getCurrentPage().As(LoginPage.class).Login(mapTable.get("UserName"), mapTable.get("Password"));

    }

    @Then("^I click login button$")
    public void iClickLoginButton() throws InterruptedException {
        //Home Page
        CurrentPageContext.setCurrentPage(CurrentPageContext.getCurrentPage().As(LoginPage.class).ClickLogin());
    }

    @Then("I insert UserName and Password")
    public void iInsertUserNameAndPassword() {
        CurrentPageContext.getCurrentPage().As(LoginPage.class).Login();
    }

    @Then("^I should see the username with hello$")
    public void iShouldSeeTheUsernameWithHello()  {
        Assert.assertEquals("The user is not admin", "Hello admin!", CurrentPageContext.getCurrentPage().As(HomePage.class).GetLoggedInUser());

    }



}
