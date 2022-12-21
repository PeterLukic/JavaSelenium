package com.ea.framework.controls.internals;

import com.ea.framework.controls.api.ImplementedBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.interactions.Locatable;

@ImplementedBy(ControlBase.class)
public interface Control extends WebElement, WrapsElement, Locatable {
    ControlBase Wait();

    ControlBase WaitForVisible();

    ControlBase Click();

    ControlBase ScrollToElement();
}
