package com.company.basic.Klasat.class_and_object_1.shembuj;

public class Student {

    private String id;
    private String emri;
    private String ditelindja;
    private char gjinija;
    private String drejtimi;
    private int vitiRegjistrimit;

    public void Student(String id, String emri, String ditelindja, char gjinija, String drejtimi, int vitiRegjistrimit) {
        this.id =id;
        this.emri = emri;
        this.ditelindja= ditelindja;
        this.gjinija = gjinija;
        this.drejtimi=drejtimi;
        this.vitiRegjistrimit=vitiRegjistrimit;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public java.lang.String getEmri() {
        return emri;
    }
    public void setEmri(String emri) {
        this.emri = emri;
    }
    public char getGjinija() {
        return gjinija;
    }
    public void setGjinija(char gjinija) {
        this.gjinija = gjinija;
    }
    public String getDrejtimi() {
        return drejtimi;
    }
    public void setDrejtimi(String drejtimi) {
        this.drejtimi = drejtimi;
    }
    public String getDitelindja() {
        return ditelindja;
    }
    public void setDitelindja(String ditelindja) {
        this.ditelindja = ditelindja;
    }
    public int getVitiRegjistrimit() {
        return vitiRegjistrimit;
    }
    public void setVitiRegjistrimit(int vitiRegjistrimit) {
        this.vitiRegjistrimit = vitiRegjistrimit;
    }
}


