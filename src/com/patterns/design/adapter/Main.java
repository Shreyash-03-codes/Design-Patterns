package com.patterns.design.adapter;

import com.patterns.design.adapter.iphoneadapter.SamsungToIPhoneChargerAdapter;
import com.patterns.design.adapter.android.SamsungM35Charger;
import com.patterns.design.adapter.iphone.IPhone17;

public class Main {
    public static void main(String[] args) {
//        IPhone17 iPhone17=new IPhone17(new IPhone17Charger());
//        iPhone17.charge();

//        SamsungM35 samsungM35=new SamsungM35(new SamsungM35Charger());
//        samsungM35.charge();


        // now lets assume that we dont have the charger of Iphone17

        SamsungToIPhoneChargerAdapter iphoneChargerAdapter=new SamsungToIPhoneChargerAdapter(new SamsungM35Charger());
        IPhone17 iPhone17=new IPhone17(iphoneChargerAdapter);
        iPhone17.charge();
    }
}
