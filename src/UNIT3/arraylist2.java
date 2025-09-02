package UNIT3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class arraylist2 {

    public static void main(String[] args) {

        ArrayList<String> products= new ArrayList<>();
        System.out.println("Enter the number of Products");
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            products.add(sc.nextLine());
        }

        Iterator it = products.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        products.add(1,"apple");
        products.addLast("Banana");
        products.addFirst("Orange");

        System.out.println(products.get(1));

    }
}

