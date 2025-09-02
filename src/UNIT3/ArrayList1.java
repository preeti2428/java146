package UNIT3;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(12);
        al.add(1);
        al.add(14);
        al.add(16);

        System.out.println(al);

        for(int al1: al){
            System.out.println(al1);
        }

    }
}


