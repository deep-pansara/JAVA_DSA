package com.dsa.array;

public class MaximumValueOfArray {


    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2, 9, 23, 50, 2, 1, 5, 7};


        int max = Integer.MIN_VALUE;
        int min = arr[0];
        int second_max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

                if (arr[i] < min) {
                    min = arr[i];
                }
            }


            System.out.println("max value -  " + max);
            System.out.println("min value -  " + min);


        }
    }
}
