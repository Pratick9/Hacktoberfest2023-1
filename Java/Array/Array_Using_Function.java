package com.abhishek.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Using_Function {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //here, array using function
        int[] nums = {1,2,3,45,8};
        System.out.println(Arrays.toString(nums));
        System.out.println("Chang an index 0, replace with a 99 using a function");
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
