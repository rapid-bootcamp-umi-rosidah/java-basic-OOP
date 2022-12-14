package javaOOP.logic.logicInterface.logic01Impl;

import javaOOP.logic.BasicLogic;
import javaOOP.logic.logicInterface.LogicInterface;

public class Logic01Soal09Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal09Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray(){
        int angka = 3;
        for (int i = 0; i < this.logic.n; i++) {
            int angka2 = (int)Math.pow(angka, i);
            this.logic.array[0][i]= String.valueOf(angka2);
        }
    }

    @Override
    public void CetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}