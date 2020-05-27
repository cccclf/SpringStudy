package com.chen.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
        seeHouse();
        contract();
        fee();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房子");
    }

    //签合同
    public void contract(){
        System.out.println("签合同");
    }

    //收中介费
    public void fee(){
        System.out.println("收中介费");
    }
}
