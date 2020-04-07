package com.bit.www;

/**
 * @Author: BaiMiao
 * @Description:
 */
/*
class sas{
    public sas(String s){
        System.out.println("B");
    }
}
public class acc extends sas{
    public acc(String s) {
        super(s);
        System.out.println("D");
    }

    public static void main(String[] args) {
new acc("C");
    }
}
*/
public class acc{
    public static boolean isAdmin(String userId){
        
        return userId.toLowerCase()=="admin";
    }

    public static void main(String[] args) {
        
        System.out.println(isAdmin("Admin"));
    }
}
