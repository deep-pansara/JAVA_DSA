package com.dsa.array;

public class SumOfArray {

    public static void main(String[] args) {
        int[] arr = new int[10];

        arr[0]=12;
        arr[1]=12;
        arr[2]=12;
        arr[3]=12;
        arr[4]=12;
        arr[5]=12;
        arr[6]=12;
        arr[7]=12;
        arr[8]=12;
        arr[9]=12;


        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}
