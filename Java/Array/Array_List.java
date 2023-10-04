package com.abhishek.Array;
// We can use an arrayList and add element

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number add in an arraylist--->>");
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        // Input
        for (int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++){
//            System.out.println(list.get(i));  // pass index here
        }
           System.out.println(list);
    }
}
