package com.dsa.array;

import java.util.ArrayList;

public class FIndLeader {
    public static void main(String[] args) {
        int[] arr = {63, 70, 80, 33, 33, 47, 20};


        ArrayList<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {


            int j = i + 1;


            while (j < arr.length && arr[i] >= arr[j]) {


                if (j == arr.length - 1) {


                    leaders.add(arr[i]);


                }


                j++;


            }


        }
        leaders.add(arr[arr.length - 1]);


        System.out.println(leaders);


    }
}

