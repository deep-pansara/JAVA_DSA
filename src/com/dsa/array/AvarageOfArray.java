package com.dsa.array;

public class AvarageOfArray {

    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int avg = 0;
        int sum = 0;


        for (int j : arr) {
            sum += j;
        }
        avg = sum / arr.length;
        System.out.println(avg);

    }}
