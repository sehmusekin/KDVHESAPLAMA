package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar;

        Scanner inp = new Scanner(System.in);

        System.out.println("KDV Hesaplama");

        System.out.print("ÜCRET TUTARI GİRİNİZ : ");
        tutar = inp.nextDouble();


        double kdvOrani;
        if(tutar >1000){
            kdvOrani=0.08;
        } else {
            kdvOrani=0.18;

        }


        double kdvtutar=(tutar*kdvOrani);
        double kdvliTutar=(tutar +kdvtutar);

        System.out.println("KDV'siz Tutar :" +tutar);
        System.out.println("KDV Oranı :"+kdvOrani );
        System.out.println("KDV Tutarı :" +kdvliTutar);
        System.out.println("KDV'li Tutar :" +kdvliTutar);



    }
}
