package javaOOP.logic.logicInterface.logic02Impl;

import javaOOP.logic.BasicLogic;
import javaOOP.logic.logicInterface.LogicInterface;

public class Logic02Soal09Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal09Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray() {
        int[][] matriks = new int[logic.n][logic.n];
        int kolom = 0;

        for (int i = 0; i < logic.n; i++) {
            for (int j = 0; j < logic.n; j++) {
                if (i == 0 && j == logic.n / 2 || j == 0 && i == logic.n / 2) matriks[i][j] = 1;
                else if (j == logic.n / 2 && i <= logic.n / 2) matriks[i][j] = matriks[i - 1][j] + 2;
                else if (j == logic.n / 2 && i > logic.n / 2) matriks[i][j] = matriks[i - 1][j] - 2;
            }
            if (i <= logic.n / 2 && i > 0) {
                for (int k = 1; k <= i; k++) {
                    matriks[i][logic.n / 2 - k] = matriks[i][logic.n / 2] - 2 * k;
                    matriks[i][logic.n / 2 + k] = matriks[i][logic.n / 2] - 2 * k;
                }
                kolom++;
            } else {
                for (int k = 1; k <= kolom; k++) {
                    matriks[i][logic.n / 2 - k] = matriks[i][logic.n / 2] - 2 * k;
                    matriks[i][logic.n / 2 + k] = matriks[i][logic.n / 2] - 2 * k;
                }
                kolom--;
            }
        }

        int nilaiTengah = this.logic.n / 2;
        for (int i = 0; i < this.logic.n; i++) {
            for (int j = 0; j < this.logic.n; j++) {
                if (j - i <= nilaiTengah
                        && i - j <= nilaiTengah
                        && i + j >= nilaiTengah
                        && i + j <= nilaiTengah+logic.n-1)
                    this.logic.array[i][j] = String.valueOf(matriks[i][j]);
            }
        }
    }

    @Override
    public void CetakArray() {
        this.isiArray();
        this.logic.print();
    }
}