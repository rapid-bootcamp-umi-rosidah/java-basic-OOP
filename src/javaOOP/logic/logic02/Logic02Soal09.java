package javaOOP.logic.logic02;

import javaOOP.logic.BasicLogic;

public class Logic02Soal09 extends BasicLogic {
    public Logic02Soal09(int n) {
        super(n);
    }

    public void isiArray(){
        int nilaiTengah = this.n/2;
        for (int i = 0; i < n; i++) {
            int angka = 1;
            for (int j = 0; j < n; j++) {
                if(i+j >= nilaiTengah + n-1 ){
                    this.array[i][j] = String.valueOf(angka);
                    angka+=2;
                }
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}


