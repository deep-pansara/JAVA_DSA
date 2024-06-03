package com.dsa.array;

public class MaximumElementInArray {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 10};

        MaximumElementInArray m = new MaximumElementInArray();
        int maximum = m.maxElement(num);
        System.out.println(maximum);

    }

    int maxElement(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


}
