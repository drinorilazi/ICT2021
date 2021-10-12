package com.company.basic.Enums;

public class TestNotat {
    public static void main(String[] args) {
         Notat VlersoDrinorin=Notat.DOBET_VALUE;
         Notat VlersoNaimin= Notat.SHKELQYESHUM_VALUE;

        System.out.println(VlersoDrinorin.getValue());
        System.out.println(VlersoNaimin.getValue());

        for (Notat notat: Notat.values()){
            notat.print();
        }
    }


}
