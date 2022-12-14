package javaOOP.logic.logicInterface.logic02Impl;

import javaOOP.logic.BasicLogic;
import javaOOP.logic.logicInterface.LogicInterface;

public class Logic02Soal06Impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic02Soal06Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray(){
        for (int i = 0; i < this.logic.n; i++) {
            int angka = 1;
            int angka1 = 1;
            for (int j = 0; j < this.logic.n; j++) {
                if(i+j>=this.logic.n-1 && i-j<=0 ||
                        i-j>=0 && i+j<=this.logic.n-1
                ){
                    this.logic.array[j][i] = String.valueOf(angka);
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
