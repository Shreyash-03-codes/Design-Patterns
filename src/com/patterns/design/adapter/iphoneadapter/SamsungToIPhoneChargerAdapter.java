package com.patterns.design.adapter.iphoneadapter;

import com.patterns.design.adapter.android.SamsungCharger;
import com.patterns.design.adapter.iphone.IPhoneCharger;

public class SamsungToIPhoneChargerAdapter implements IPhoneCharger {

    private SamsungCharger samsungCharger;

    public SamsungToIPhoneChargerAdapter(SamsungCharger samsungCharger){
        this.samsungCharger=samsungCharger;
    }

    @Override
    public void chargeIPhone() {
        System.out.println("Charging the IPhone 17 By using the Adapter");
        samsungCharger.chargeSamsung();
    }
}
