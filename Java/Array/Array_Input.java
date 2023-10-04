package com.abhishek.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to add in an array");
//        System.out.println("");
        int[] arr = new int[5];
        // input using for loops
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        Printing element
//        for (int i=0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int num : arr){  // for every element in array, print the array
//            System.out.print(num + " ");  // here the num is represents element of the array
//        }

//        using String change a value in an array
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.println("Change a String index 2 replace with a jack--->> ");
        System.out.println(Arrays.toString(str));

        // modify Change the value of the array
        str[2] = "Jack";
        System.out.println(Arrays.toString(str));
    }
}
