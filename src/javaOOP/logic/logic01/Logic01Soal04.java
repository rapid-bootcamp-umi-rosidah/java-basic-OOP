package javaOOP.logic.logic01;

import javaOOP.logic.BasicLogic;

public class Logic01Soal04 extends BasicLogic {
    public Logic01Soal04(int n) {
        super(n);
    }

    public void isiArray(){
        int N = 1;
        int N1 = 1;
        for (int i = 0; i < this.n; i++) {
            this.array[0][i]= String.valueOf(N);
            int sum = N + N1;
            N = N1;
            N1 = sum;
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
