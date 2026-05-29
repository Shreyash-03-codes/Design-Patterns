package com.patterns.design.adapter.android;

public class SamsungM35Charger implements SamsungCharger{
    @Override
    public void chargeSamsung() {
        System.out.println("Charging The Samsung M35....");
    }
}
