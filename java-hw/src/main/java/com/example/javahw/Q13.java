package com.example.javahw;
//Write a Java program to display. Expected Output
public class Q13 {

    public static void main(String args[])
    {
//determines JRE version.
        System.out.println("Java Version is: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version is: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home is: "+System.getProperty("java.home"));
        System.out.println("Java Vendor is: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL is: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path is: "+System.getProperty("java.class.path"));
    }
}
