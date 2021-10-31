package screable;

import java.util.Scanner;

public class Main {

        static int oyuncu1puanı;
        static int oyuncu2puanı;
        static Scanner scan= new Scanner(System.in);
        public static String Oyuncu1kelime() {
            String kelime1=scan.next();
            System.out.println("Oyuncu 1'in girdigi kelime : " + kelime1 + " kabul ediyor musunuz?");
            oyuncu1puanı+=kelime1.length();
            return kelime1;
        }

        public static String Oyuncu2kelime() {
            String kelime2=scan.next();
            System.out.println("Oyuncu 2'nin girdigi kelime : " + kelime2 + " kabul ediyor musunuz?");
            oyuncu2puanı+=kelime2.length();
            return kelime2;
        }

        public static void main(String[] args) {
            String devam;
            System.out.println("Oyuna hoşgeldiniz");

            do {
                System.out.println("Oyuncu 1: geçerli bir kelime girin lütfen");
                Oyuncu1kelime();

                System.out.println("diger oyuncu:Evet icin --> 'E', Hayır icin --> 'H' giriniz");
                devam = scan.next();
                if (devam.equalsIgnoreCase("E")) {
                    System.out.println("OYUNCU 2: Girilen kelimeyi kabul ettiniz. Lütfen yeni kelime giriniz");
                    Oyuncu2kelime();
                    System.out.println("Evet icin --> 'E', Hayır icin --> 'H' giriniz");
                    devam = scan.next();
                }

            } while (devam.equalsIgnoreCase("e"));

            if (oyuncu2puanı>oyuncu1puanı){
                System.out.println("Oyuncu 2 oyunu kazandı");}
            else if (oyuncu2puanı==oyuncu1puanı){
                System.out.println("Esit puan aldınız");}
            else  {
                System.out.println("Oyuncu 1 oyunu kazandı");}
            System.out.println("Oyuncu1 puanı: " + oyuncu1puanı);
            System.out.println("Oyuncu2 puanı: " + oyuncu2puanı);



        }

    }




