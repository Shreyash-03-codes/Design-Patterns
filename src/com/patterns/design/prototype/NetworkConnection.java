package com.patterns.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Prototype<NetworkConnection>{
    private String name;
    private String url;
    private String key;
    private boolean isConnected;
    private List<String> domains;

    public NetworkConnection(){
        domains=new ArrayList<>();
        this.domains.add("www.google.com");
        this.domains.add("www.apple.com");
        this.domains.add("www.facebook.com");
        this.domains.add("www.instagram.com");
    }
    public NetworkConnection(NetworkConnection networkConnection){
        this.name=networkConnection.name;
        this.url=networkConnection.url;
        this.key=networkConnection.key;
        this.isConnected=networkConnection.isConnected;
//        this.domains=networkConnection.domains;
        List<String> list=networkConnection.domains;
        this.domains=new ArrayList<>();
        for(String e:list){
            this.domains.add(e);
        }
    }

    public NetworkConnection(String name,String url,String key){
        this();
        this.name=name;
        this.url=url;
        this.key=key;
        this.connect();
    }

    private void connect()  {
        int i=5;
        while (i-->0){
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.print(". ");
        }
        System.out.println();
        System.out.println("Network Connected");
        this.isConnected=true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public NetworkConnection cloneNetworkConnection() {
       return new NetworkConnection(this);
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", key='" + key + '\'' +
                ", isConnected=" + isConnected +
                ", domains=" + domains +
                '}';
    }
}
