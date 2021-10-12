package com.company.basic.ushtrime2_09_29_2021;


import java.util.Scanner;

public class EKuleta {
    public static void main(String[] args) {
        Scanner user= new Scanner(System.in);

        int sa1cent, sa2cent, sa5cent, sa10centsha, sa20cent, sa50cent, sa1euro, sa2euro;

        System.out.print("Sa 1 cent: ");
        sa1cent= user.nextInt();
        System.out.print("Sa 2 cent: ");
        sa2cent= user.nextInt();
       
        System.out.println("----------------------------------------");
        System.out.printf("Sa 1 centshe: %5d %10.2f EUR %n",sa1cent,sa1cent*0.01);
        System.out.printf("Sa 2 centshe: %5d %10.2f EUR %n",sa2cent, sa2cent*0.02);
        System.out.println("-----------------------------------------");

        System.out.printf("Totali: %22.2f Eur %n",(sa1cent* 0.01 + sa2cent *0.02));
        System.out.println("-----------------------------------------");

    }
}
