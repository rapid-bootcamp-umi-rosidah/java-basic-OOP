package solutionLogic;

public class Logic1 {
    public static void main(String[] args) {
        soal1(9);
        soal2(9);
        soal3(9);
        soal4(9);
        soal5(9);
        soal6(9);
        soal8(9);
        soal9(9);
        soal10(9);
    }

    public static void soal1(int n) {
        System.out.println("soal 1 : ");
        int[] deret = new int[n];
        for(int i = 1; i <= deret.length; i++)
        {
            System.out.print(i + "\t");
        }
        System.out.println("\n");
    }

    public static void soal2(int n) {
        int hasil = 0;
        int akhir = 0;
        System.out.println("soal 2 : ");
        int[] deret = new int[n];
        for (int i = 0; i < deret.length; i++) {
            if (i % 2 == 0) {
                if (i == 0) {
                    hasil = 1;
                    System.out.print(hasil + "\t");
                } else {
                    System.out.print(hasil + "\t");
                }
            } else {
                akhir = hasil * 3;
                System.out.print(akhir + "\t");
                hasil = akhir - i;
            }
        }
        System.out.println("\n");
    }

    public static void soal3(int n) {
        System.out.println("soal 3 : ");
        int[] deret = new int[n];
        for(int i = 0; i < deret.length; i++) {
            if (i == 0) {
                deret[i] = 0;
            }else {
                deret[i]=deret[i-1]+2;
            }
            System.out.print(deret[i] + "\t");
            }
        System.out.println("\n");
        }

    public static void soal4(int n) {
        System.out.println("soal 4 : ");
        int N = 1;
        int N1 = 1;
        int[] deret = new int[n];
        for (int i = 1; i <= deret.length; i++) {
            System.out.print( N + "\t");
            int sum = N + N1;
            N = N1;
            N1 = sum;
        }
        System.out.println("\n");
    }

    public static void soal5(int n) {
        System.out.println("soal 5 : ");
        int N = 1;
        int N1 = 1;
        int N2 = 1;
        int[] deret = new int[n];
        for (int i = 1; i <= deret.length; i++) {
            System.out.print( N + "\t");
            int sum = N + N1 + N2;
            N = N1;
            N1 = N2;
            N2= sum;
        }
        System.out.println("\n");
    }

    public static void soal6(int n) {
        System.out.println("soal 6 : ");
        int[] deret = new int[n];
        int a = 0;

        for (int i=0; i<= 99; i++){
            int bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                a+=1;
                if(a <= deret.length){
                    System.out.print(i+"\t");
                }else{
                    i=99;
                }

            }
        }System.out.println("\n");
    }

    public static void soal8(int n){
        System.out.println("soal 8 : ");
        String[] deret = new String[n];
        char huruf = 'A';
        int angka = 2;
        // isi array
        for (int i = 0; i < n; i++) {
            // genap dulu
            if(i % 2 == 0){
                deret[i] = String.valueOf(huruf);
            }else {
                deret[i] = String.valueOf(angka);
                angka+=2;
            }
            huruf++;
        }
        // print array
        PrintArray.print(deret);
        System.out.println("\n");
    }

    public static void soal9(int n){
        System.out.println("soal 9 : ");
        int[] deret = new int[n];
        for (int i = 0; i < n; i++) {
            deret[i] = (int)Math.pow(3,i);
        }
        // print array
        PrintArray.print(deret);
        System.out.println("\n");
    }

    public static void soal10(int n){
        System.out.println("soal 10 : ");
        int[] deret = new int[n];
        for (int i = 0; i < n; i++) {
            deret[i] = (int)Math.pow(i,3);
        }
        // print array
        PrintArray.print(deret);
        System.out.println("\n");
    }
}
