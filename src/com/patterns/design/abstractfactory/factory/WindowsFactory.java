package com.patterns.design.abstractfactory.factory;

import com.patterns.design.abstractfactory.button.Button;
import com.patterns.design.abstractfactory.button.WindowsButton;
import com.patterns.design.abstractfactory.checkbox.Checkbox;
import com.patterns.design.abstractfactory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckbox();
    }
}
