package com.patterns.design.adapter.android;

public class SamsungM35 {

    private SamsungCharger samsungCharger;

    public SamsungM35(SamsungCharger samsungCharger){
        this.samsungCharger=samsungCharger;
    }

    public void charge(){
        this.samsungCharger.chargeSamsung();
    }
}
