package com.patterns.design.prototype;

public class Main {
    public static void main(String[] args) {
        NetworkConnection original=new NetworkConnection("Galaxy","https://localhost:9999","ewrncaeuisry-rcesra");


        NetworkConnection networkConnection2=original.cloneNetworkConnection();
        networkConnection2.setKey("bcryurerytrserca-rcesntuidtiu");
        networkConnection2.setName("Iphone");

        NetworkConnection networkConnection3=original.cloneNetworkConnection();
        networkConnection2.setKey("uuttiuriurie448774634-45844dn5f484398");
        networkConnection2.setName("Vivo");
        System.out.println(original);
        System.out.println(networkConnection2);
        System.out.println(networkConnection3);


        original.getDomains().remove(original.getDomains().get(0));

        System.out.println("-------------------------------------------------------------------");

        System.out.println(original);
        System.out.println(networkConnection2);
        System.out.println(networkConnection3);

    }
}
