package steps;

import com.ea.framework.base.CurrentPageContext;
import com.ea.framework.base.DriverContext;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.*;
import model.EmployeeModel;
import pages.CreateEmployeePage;
import pages.EmployeeListPage;
import pages.HomePage;

import java.util.List;
import java.util.Map;

public class EmployeeSteps  {

    @DataTableType
    public EmployeeModel convertEmployeeModel(Map<String, String> entry) {
        return EmployeeModel.createEmployeeModel(entry);
    }

    @And("^I click employeeList link$")
    public void iClickEmployeeListLink() {
        CurrentPageContext.setCurrentPage(CurrentPageContext.getCurrentPage().As(HomePage.class).ClickEmployeeList());
        DriverContext.WaitForPageToLoad();
    }

    @Then("I click create new button")
    public void iClickCreateNewButton()  {
        CurrentPageContext.setCurrentPage(CurrentPageContext.getCurrentPage().As(EmployeeListPage.class).ClickCreateNew());
        DriverContext.WaitForPageToLoad();
    }

    @And("^I enter following details$")
    public void iEnterFollowingDetails(List<EmployeeModel> table) {
        CurrentPageContext.getCurrentPage().As(CreateEmployeePage.class).CreateEmployee(table.stream().findFirst().get());
    }

    @And("^I click create button$")
    public void iClickCreateButton()  {
        CurrentPageContext.getCurrentPage().As(CreateEmployeePage.class).ClickCreateButton();

    }


}
