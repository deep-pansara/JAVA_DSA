package com.dsa.array;

public class SecondLargestArrayElement {

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest && j != largest) {
                secondLargest = j;
            }

        }
        return secondLargest;

    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 8, 4, 9, 199, 220, 2, 5};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element is: " + secondLargest);
    }
}
