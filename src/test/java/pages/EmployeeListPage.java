package pages;

import com.ea.framework.base.BasePage;
import com.ea.framework.controls.elements.Button;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class EmployeeListPage extends BasePage {

    @FindBy(how = How.NAME, using = "searchTerm")
    public WebElement txtSearch;

    @FindBy(how = How.LINK_TEXT, using = "Create New")
    public Button lnkCreateNew;

    @FindBy(how = How.CLASS_NAME, using = "table")
    public WebElement tblEmployeeList;


    public CreateEmployeePage ClickCreateNew()
    {
        lnkCreateNew.WaitForVisible().Click();
        return GetInstance(CreateEmployeePage.class);
    }

    public WebElement GetEmployeeList()
    {
        return tblEmployeeList;
    }

}
