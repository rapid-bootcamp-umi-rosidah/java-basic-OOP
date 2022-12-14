package javaOOP.logic.logicInterface.logic02Impl;

import javaOOP.logic.BasicLogic;
import javaOOP.logic.logicInterface.LogicInterface;

public class Logic02Soal04Impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic02Soal04Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int nilaiTengah = this.logic.n/2;
        for (int i = 0; i < this.logic.n; i++) {
            int angka = 1;
            int angka1 = 1;
            for (int j = 0; j < this.logic.n; j++) {
                if(j==0 || i==0  || i == this.logic.n-1 || j== this.logic.n-1
                        || i==nilaiTengah || j==nilaiTengah
                ){
                    this.logic.array[i][j] = String.valueOf(angka);
                }
                int sum = angka + angka1;
                angka = angka1;
                angka1 = sum;
            }
        }
    }

    @Override
    public void CetakArray() {
        this.isiArray();
        this.logic.print();

    }
}
