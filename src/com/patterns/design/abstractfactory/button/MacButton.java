package com.patterns.design.abstractfactory.button;

public class MacButton implements Button{
    @Override
    public void click() {
        System.out.println("Macos Button Clicked...!!");
    }
}
