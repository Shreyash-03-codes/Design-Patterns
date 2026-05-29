package com.patterns.design.abstractfactory.factory;

import com.patterns.design.abstractfactory.button.Button;
import com.patterns.design.abstractfactory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
