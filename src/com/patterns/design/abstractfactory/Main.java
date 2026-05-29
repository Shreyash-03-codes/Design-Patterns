package com.patterns.design.abstractfactory;

import com.patterns.design.abstractfactory.button.Button;
import com.patterns.design.abstractfactory.checkbox.Checkbox;
import com.patterns.design.abstractfactory.enums.OSType;
import com.patterns.design.abstractfactory.factory.FactoryProvider;
import com.patterns.design.abstractfactory.factory.GUIFactory;

public class Main {
    public static void main(String[] args) {

        GUIFactory guiFactory=FactoryProvider.getFactory(OSType.MACOS);
        Button button=guiFactory.createButton();
        Checkbox checkBox= guiFactory.createCheckBox();

        button.click();
        checkBox.check();
    }
}
