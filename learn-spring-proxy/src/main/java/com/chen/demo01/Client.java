package com.chen.demo01;

public class Client {
    public static void main(String[] args) {

        //房东要租房子
        Host host = new Host();
        //中介代理房东出租房子，但是中介会加一些附属操作
        Proxy proxy = new Proxy(host);

        proxy.rent();
    }
}
