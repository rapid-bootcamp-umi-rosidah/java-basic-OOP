package javabasic;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //sampleConvert(scanner);
        System.out.println("Masukan Angka: ");
        String input = scanner.next();
        int nilai = stringConverter(input);
        // cara manggil pertama
        convertNilai(nilai);

        // cara kedua, param method
        //convertNilai(stringConverter(input));
        System.out.println("Nilai : "+ convertNilai2(stringConverter(input)));

    }
        public static void convertNilai(int nilai){
        //if else condition
        if (nilai <= 100 && nilai >= 81 ) {System.out.println(" Nilai A");}
        else if (nilai <= 80 && nilai >= 61 ) {System.out.println(" Nilai B");}
        else if (nilai <= 60 && nilai >= 41 ) {System.out.println(" Nilai C");}
        else if (nilai <= 40 && nilai >= 21 ) {System.out.println(" Nilai D");}
        else if (nilai <= 20 && nilai >= 0 )  {System.out.println(" Nilai E");}
        else {System.out.println(" Input nilai tidak sesuai");}
    }
    public static String convertNilai2(int nilai){
        // nilai 0 - 20 => E
        if(nilai <=20) {return "E";}
        // nilai 21 - 40 => D
        else if (nilai <= 40) {return "D";}
        // nilai 41 - 60 => C
        else if (nilai <= 60) {return "C";}
        // nilai 61 - 80 => B
        else if (nilai <= 80) {return "B";}
        // nilai 81 - 100 => A
        else {return "A";}
    }


    public static Integer stringConverter(String input) {
        int result = 0;
        try {
            result = Integer.parseInt(input);

        }catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
        return result;
    }

        public static void sampleConvert(Scanner scanner){
            //first input
            System.out.println(" Masukkan angka : ");
            String input1 = scanner.next();
            System.out.println("Hasil input1: " + input1);

            //second input
            System.out.println(" Masukkan angka 2 : ");
            String input2 = scanner.next();
            System.out.println("Hasil input2: " + input2);

            System.out.println("convert....");
            int angka1 = 0;
            int angka2 = 0;
            try {
                angka1 = Integer.parseInt(input1);
                angka2 = Integer.parseInt(input2);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("hitung...");
            int hasil = angka1 + angka2;
            System.out.println(" Hasil Jumlah : " + hasil);
        }
    }
