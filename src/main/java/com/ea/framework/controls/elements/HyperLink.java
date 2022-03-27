package com.ea.framework.controls.elements;

import com.ea.framework.controls.api.ImplementedBy;
import com.ea.framework.controls.internals.Control;
import com.ea.framework.controls.internals.ControlBase;

/**
 * Created by Karthik-pc on 12/10/2016.
 */

@ImplementedBy(HyperLinkBase.class)
public interface HyperLink extends Control{


    void ClickLink();
    String GetUrlText();
    boolean CheckUrlTextContains(String containsText);
    ControlBase Wait();
    ControlBase WaitForVisible();
    ControlBase Click();
}
