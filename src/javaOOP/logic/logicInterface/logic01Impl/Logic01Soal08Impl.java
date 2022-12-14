package javaOOP.logic.logicInterface.logic01Impl;

import javaOOP.logic.BasicLogic;
import javaOOP.logic.logicInterface.LogicInterface;

public class Logic01Soal08Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal08Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray(){
        char huruf = 'A';
        int angka = 2;
        for (int i = 0; i < logic.n; i++) {
            if(i % 2 == 0){
                this.logic.array[0][i] = String.valueOf(huruf);
            }else {
                this.logic.array[0][i] = String.valueOf(angka);
                angka+=2;
            }
            huruf++;
        }
    }

    @Override
    public void CetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}