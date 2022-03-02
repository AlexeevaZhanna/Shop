package com.company;
import java.io.File;
import java.io.FilenameFilter;

public class Kassir implements  FilenameFilter{

    private String fio;
    private int age;
    private int number;
    private int sale;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }




    public  Kassir (String fio, int age, int number, int sale) {
        this.fio = fio;
        this.age = age;
        this.number = number;
        this.sale = sale;
    }

    public Kassir() {


    }

    public boolean accept(File dir, String name){
    return name.contains("kassir");
}

    @Override
    public String toString() {
        return "Kassir{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", sale=" + sale +
                '}';
    }
}
