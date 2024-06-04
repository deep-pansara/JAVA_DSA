package com.dsa.array;

public class MaximumElementInArray {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 10};

        MaximumElementInArray m = new MaximumElementInArray();
        int maximum = m.maxElement(num);
        int minimum = m.minElement(num);
        System.out.println(maximum);
        System.out.println(minimum);

    }

    int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = max; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        return max;
    }

    int minElement(int[] arr) {
        int min = arr[0];
        for (int i = min; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        return min;
    }


}
