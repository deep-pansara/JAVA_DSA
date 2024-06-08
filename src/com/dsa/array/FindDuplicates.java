package com.dsa.array;

public class FindDuplicates {


    public static void main(String[] args) {

        int[] arr = {25, 23, 44, 55, 66, 77, 88, 11, 22, 25, 23, 44, 55, 432, 432};


        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("duplicate element  " + arr[j]);
                }
            }


        }


    }
}
