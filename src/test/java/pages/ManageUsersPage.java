package pages;

import com.ea.framework.base.BasePage;
import com.ea.framework.base.DriverContext;
import com.ea.framework.base.LocalDriverContext;
import com.ea.framework.controls.elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class ManageUsersPage extends BasePage {

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/table[@class='table']/tbody/tr[3]/td[4]/input[@value='Assign']")
    public Button buttonAssign;


    public void SelectRoleByText(String text) throws InterruptedException {
        DriverContext.WaitForPageToLoad();
        Thread.sleep(2000);
        Select ddRoles = new Select(LocalDriverContext.getRemoteWebDriver().findElement(By.xpath("/html/body//table[@class='table']/tbody/tr[3]/td[3]/select[@id='RoleName']")));
        ddRoles.selectByVisibleText(text);
        Thread.sleep(2000);

    }
    public void ClickButtonAssign() throws InterruptedException {
        DriverContext.WaitForPageToLoad();
        Thread.sleep(2000);
        buttonAssign.WaitForVisible().Click();
    }


}
