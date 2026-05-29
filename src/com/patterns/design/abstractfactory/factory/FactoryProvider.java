package com.patterns.design.abstractfactory.factory;

import com.patterns.design.abstractfactory.enums.OSType;

public final class FactoryProvider {
    public static GUIFactory getFactory(OSType osType){
        return switch (osType) {
            case MACOS -> new MacFactory();
            case WINDOWS -> new WindowsFactory();
        };
    }
}
