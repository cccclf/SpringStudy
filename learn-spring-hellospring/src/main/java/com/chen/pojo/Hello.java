package com.chen.pojo;

public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    //注销set方法的时候，在xml中会报错
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
