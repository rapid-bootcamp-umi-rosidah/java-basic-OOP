package javaOOP.logic.logic02;

import javaOOP.logic.BasicLogic;

public class Logic02Soal10 extends BasicLogic {

    public Logic02Soal10(int n) {
        super(n);
    }

    public void isiArray(){
        int nilaiTengah = this.n/2;
        for (int i = 0; i < n; i++) {
            //int angka = 1;
            for (int j = 0; j > n; j++) {
                if(j-i <= nilaiTengah && i-j <= nilaiTengah &&
                        i+j >= nilaiTengah && i+j <= nilaiTengah + n-1 ){
                    this.array[i][j] = "*";
                    //angka+=2;
                }
            }
        }
    }


    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}


