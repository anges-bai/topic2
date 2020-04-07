package com.bit.www;


/**
 * @Author: BaiMiao
 * @Description:
 */


public class Test3 {
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer("A");
        StringBuffer b=new StringBuffer("B");
        operate(a,b);
        System.out.println(a+"."+b);

    }
    static void operate(StringBuffer x,StringBuffer y){
        x.append(y);
        y=x;
    }
}
