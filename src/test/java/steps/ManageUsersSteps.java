package steps;

import com.ea.framework.base.CurrentPageContext;
import com.ea.framework.base.DriverContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.ManageUsersPage;

public class ManageUsersSteps {
    @And("I click lnkManageUsers link")
    public void iClickLnkManageUsersLink() {
        CurrentPageContext.setCurrentPage(CurrentPageContext.getCurrentPage().As(HomePage.class).ClickManageUsers());
        DriverContext.WaitForPageToLoad();
    }

    @Then("I select Role {string}")
    public void iSelectRole(String roleValue) throws InterruptedException {
        CurrentPageContext.getCurrentPage().As(ManageUsersPage.class).SelectRoleByText(roleValue);
    }

    @Then("I click on button Assign")
    public void iClickOnButtonAssign() throws InterruptedException {
        CurrentPageContext.getCurrentPage().As(ManageUsersPage.class).ClickButtonAssign();
        DriverContext.WaitForPageToLoad();
        Thread.sleep(500);
    }
}
