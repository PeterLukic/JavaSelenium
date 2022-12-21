package pages;

import com.ea.framework.base.BasePage;
import com.ea.framework.base.DriverContext;
import com.ea.framework.controls.elements.TextBox;
import model.EmployeeModel;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateEmployeePage extends BasePage {

    @FindBy(how = How.ID, using = "Name")
    public TextBox txtName;

    @FindBy(how = How.ID, using = "Salary")
    public TextBox txtSalary;
    @FindBy(how = How.ID, using = "DurationWorked")
    public TextBox txtDurationWorked;

    @FindBy(how = How.ID, using = "Grade")
    public TextBox txtGrade;

    @FindBy(how = How.ID, using = "Email")
    public TextBox txtEmail;

    @FindBy(how = How.XPATH, using = "//input[@value='Create']")
    public TextBox btnCreateEmployee;

    public void ClickCreateButton() {
        btnCreateEmployee.submit();
    }


//    public void CreateEmployee(String name, String salary, String durationWorked, String grade, String email) {
//        DriverContext.WaitForElementVisible(txtEmail);
//        txtName.sendKeys(name);
//        txtSalary.sendKeys(salary);
//        txtDurationWorked.sendKeys(durationWorked);
//        txtGrade.sendKeys(grade);
//        txtEmail.sendKeys(email);
//    }

    public void CreateEmployee(EmployeeModel employeeModel) {
        DriverContext.WaitForElementVisible(txtEmail);
        txtName.sendKeys(employeeModel.Name);
        txtSalary.sendKeys(employeeModel.Salary);
        txtDurationWorked.sendKeys(employeeModel.DurationWorked);
        txtGrade.sendKeys(employeeModel.Grade);
        txtEmail.sendKeys(employeeModel.Email);
    }
}
