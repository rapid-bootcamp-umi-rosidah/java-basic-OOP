package javaOOP.logic;

import javaOOP.logic.logic02.Logic02Soal01;
import javaOOP.logic.logic02.Logic02Soal09;
import javaOOP.logic.logic02.Logic02Soal10;

public class MainLogic2 {
    public static void main(String[] args) {
        Logic02Soal01 soal1 = new Logic02Soal01(9);
        System.out.println("\n\n # Logic 2 soal 1 : ");
        soal1.cetakArray();

        Logic02Soal09 soal9 = new Logic02Soal09(9);
        System.out.println("\n\n # Logic 2 soal 9 : ");
        soal9.cetakArray();

        Logic02Soal10 soal10 = new Logic02Soal10(9);
        System.out.println("\n\n # Logic 2 soal 10 : ");
        soal10.cetakArray();
    }
}

