package javaOOP.logic.logicInterface.logic01Impl;

import javaOOP.logic.BasicLogic;
import javaOOP.logic.logicInterface.LogicInterface;

public class Logic01Soal06Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal06Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray(){
        int angka1 = 2;
        int angka2 = 5;
        int angka3 = 7;

        for (int i = 0; i < this.logic.n; i++) {

            if(i == 0 || i ==1) {
                this.logic.array[0][i] = String.valueOf(angka1);
                angka1= angka1+1;
            }
            else if(i==2||i==4||i==6||i==8 ){
                this.logic.array[0][i]= String.valueOf(angka2);
                angka2 = angka2+6;
            }
            else{
                this.logic.array[0][i]= String.valueOf(angka3);
                angka3 = angka3+6;
            }
        }
    }

    @Override
    public void CetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}