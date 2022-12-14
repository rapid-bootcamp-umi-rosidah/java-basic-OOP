package javaOOP.logic.logicInterface.logic02Impl;

import javaOOP.logic.BasicLogic;
import javaOOP.logic.logicInterface.LogicInterface;

public class Logic02Soal02Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal02Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        for (int i = 0; i < this.logic.n; i++) {
            int angka = 1;
            for (int j = 0; j < this.logic.n; j++) {
                if(j==0 || i==0  || i == this.logic.n-1 || j== this.logic.n-1){
                    this.logic.array[i][j] = String.valueOf(angka);
                }
                angka+=2;
            }
        }
    }

    @Override
    public void CetakArray() {
        this.isiArray();
        this.logic.print();
    }
}


