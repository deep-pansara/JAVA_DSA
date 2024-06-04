package com.dsa.array;

public class AscendinOrderCheck {
    public static void main(String[] args) {
        int[] a = {0, 2, 3, 4, 6, 7, 8};

        for (int i = 0; i < a.length; i++) {


            if (a[i] > a[a.length - 1]) {
                System.out.println("not in ascending order");
            }
        }
        System.out.println("Acending Order");


    }


}

