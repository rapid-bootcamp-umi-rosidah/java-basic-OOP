package javaOOP.logic.logicInterface.logic02Impl;

import javaOOP.logic.BasicLogic;
import javaOOP.logic.logicInterface.LogicInterface;

public class Logic02Soal07Impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic02Soal07Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray(){
        int[][] matriks = new int[logic.n][logic.n];
        int nilaiTengah = this.logic.n/2;
        for (int i = 0; i < logic.n; i++) {
            for (int j = 0; j < logic.n; j++) {
                if (j <= 1 || i <= 1 || i >= logic.n - 2 || j >= logic.n - 2) {
                    matriks[i][j] = 1;
                }
                else if (j >= i && j < logic.n - i) {
                    matriks[i][j] = matriks[i - 1][nilaiTengah] + matriks[i - 2][nilaiTengah];
                }
                else if (j >= logic.n - i - 1 && j <= i) {
                    matriks[i][j] = matriks[logic.n - i - 2][nilaiTengah] + matriks[logic.n - i - 3][nilaiTengah];
                }
                else if (j <= nilaiTengah) {
                    matriks[i][j] = matriks[i][j - 1] + matriks[i][j - 2];
                }
                else if (j >= nilaiTengah) {
                    matriks[i][j] = matriks[nilaiTengah][logic.n - j - 2] + matriks[nilaiTengah][logic.n - j - 3];
                }
            }
        }

        for (int i = 0; i < logic.n; i++) {
            for (int j = 0; j < logic.n; j++) {
                if (j >= i && j >= logic.n - i - 1 && nilaiTengah <= i
                        || j <= i && j <= logic.n - i - 1 && nilaiTengah >= i
                        || j >= nilaiTengah && j <= logic.n - i - 1
                        || j <= nilaiTengah && j >= logic.n - i - 1) {
                    this.logic.array[i][j] = String.valueOf(matriks[i][j]);
                }
            }
        }
    }

    @Override
    public void CetakArray() {
        this.isiArray();
        this.logic.print();
    }
}