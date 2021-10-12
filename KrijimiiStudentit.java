package com.company.basic.Klasat.class_and_object_1.shembuj;

public class KrijimiiStudentit {
    public static void main(String[] args) {
        Student regji=new Student();

        regji.setId("DI123");
        regji.setEmri("Drinor");
        regji.setDitelindja("2000-15-07");
        regji.setDrejtimi("Shkenca Kompjuterike");
        regji.setGjinija('M');
        regji.setVitiRegjistrimit(2018);


        System.out.printf("Studenti:%n%s%n%s%n%s%n%s%n%s%n%s%n ",
                regji.getId(),
                regji.getEmri(),
                regji.getDitelindja(),
                regji.getDrejtimi(),
                regji.getGjinija(),
                regji.getVitiRegjistrimit());
    }



}
