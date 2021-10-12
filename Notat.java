package com.company.basic.Enums;

public enum Notat {
   DOBET_VALUE(1),
    MJAFTUESHEM_VALUE(2),
    MIRE_VALUE(3),
    SHUM_MIRE_VALUE(4),
    SHKELQYESHUM_VALUE(5);


    private int value;
    private Notat(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }

    public void print(){
        System.out.printf("%s -> %s %n",this.toString(),value );
    }

    }

