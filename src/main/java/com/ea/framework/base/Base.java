package com.ea.framework.base;

import com.ea.framework.controls.api.ControlFactory;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Karthik-PC on 11/23/2018.
 */
public class Base {

    public <TPage extends BasePage> TPage GetInstance(Class<TPage> page)
    {
        //Custom control page factory initialization
        Object obj = ControlFactory.initElements(LocalDriverContext.getRemoteWebDriver(), page);
        return page.cast(obj);
    }
}
