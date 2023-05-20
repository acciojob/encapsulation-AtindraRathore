package com.driver;

public class Main {
    public static void main(String[] args) {
    RWOnly rwOnly=new RWOnly();
       //rwOnly.name="Atindra";
       //Error: name has private access in com.driver.RWOnly
       rwOnly.setName("Atindra");
       String name = rwOnly.getName();
       System.out.println(name);
    }
}
