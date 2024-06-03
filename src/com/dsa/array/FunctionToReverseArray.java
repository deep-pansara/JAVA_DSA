package com.dsa.array;

public class FunctionToReverseArray {

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7, 90};

        FunctionToReverseArray f = new FunctionToReverseArray();


        int[] reversedArray = f.reverseArray(a);

        for (int element : reversedArray) {
            System.out.println(element);
        }
    }

    int[] reverseArray(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }
        return newArr;
    }
}
