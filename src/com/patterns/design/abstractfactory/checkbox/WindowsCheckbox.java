package com.patterns.design.abstractfactory.checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Windows Check Box checked");
    }
}
