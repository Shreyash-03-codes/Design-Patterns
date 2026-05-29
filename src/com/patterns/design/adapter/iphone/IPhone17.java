package com.patterns.design.adapter.iphone;

public class IPhone17 {

    private IPhoneCharger iPhoneCharger;

    public IPhone17(IPhoneCharger iPhoneCharger){
        this.iPhoneCharger=iPhoneCharger;
    }

    public void charge(){
        this.iPhoneCharger.chargeIPhone();
    }
}
