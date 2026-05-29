package com.patterns.design.abstractfactory.factory;

import com.patterns.design.abstractfactory.button.Button;
import com.patterns.design.abstractfactory.button.MacButton;
import com.patterns.design.abstractfactory.checkbox.Checkbox;
import com.patterns.design.abstractfactory.checkbox.MacCheckbox;

public class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckbox();
    }
}
