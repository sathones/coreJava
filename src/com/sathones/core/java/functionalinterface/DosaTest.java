package com.sathones.core.java.functionalinterface;

public class DosaTest {

    public static void main(String[] args){
        Dosa dosa = new PesaraDosa();
        printDosa(dosa);
    }

    public static void printDosa(Dosa d){
        System.out.println(d.getDosaName());
    }
}
