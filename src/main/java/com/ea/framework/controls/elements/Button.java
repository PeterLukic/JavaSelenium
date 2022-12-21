package com.ea.framework.controls.elements;

import com.ea.framework.controls.api.ImplementedBy;
import com.ea.framework.controls.internals.Control;
import com.ea.framework.controls.internals.ControlBase;


@ImplementedBy(ButtonBase.class)
public interface Button extends Control {

    void PerformClick();
    String GetButtonText();
    void PerformSubmit();
    ControlBase Wait();
    ControlBase WaitForVisible();
    ControlBase Click();
    ControlBase ScrollToElement();
}
