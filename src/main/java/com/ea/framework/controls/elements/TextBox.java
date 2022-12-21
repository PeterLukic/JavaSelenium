package com.ea.framework.controls.elements;

import com.ea.framework.controls.api.ImplementedBy;
import com.ea.framework.controls.internals.Control;

@ImplementedBy(TextBoxBase.class)
public interface TextBox extends Control {

    void EnterText(String text);
    String GetTextValue();

}
