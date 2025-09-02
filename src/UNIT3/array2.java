package UNIT3;

import java.util.Scanner;


public class array2 {

    public static void main(String[] args) {
        int a[][]=new int[2][3];
        int b[][]=new int[2][3];
        int c[][]=new int[2][3];
        Scanner sc=new Scanner(System.in);

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b[i].length; j++) {
                b[i][j]=sc.nextInt();
            }
        }


        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.println();
                a[i][j]=sc.nextInt(a[i][j]);
            }
        }
        for (int[] ints : b) {
            for (int j = 0; j < ints.length; j++) {
                System.out.println(ints[j]);
            }
        }

    }

}
