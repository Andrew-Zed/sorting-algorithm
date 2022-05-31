package com.andrew;
//Write a program to sort an array in ascending order.

public class Main {
    public static void main(String[] args) {
        int temp;
        int [] arrNumbers = {12, 8, 15, 54, 41, 7, 1, 34, 17, 3, 49};
        for(int num:  arrNumbers) {
            System.out.println(num);
        }
        for(int a = 0; a < arrNumbers.length; a++) {
            for (int b = a + 1; b < arrNumbers.length; b++) {
                if (arrNumbers[a] > arrNumbers[b]) {
                    temp = arrNumbers[a];
                    arrNumbers[a] = arrNumbers[b];
                    arrNumbers[b] = temp;
                }
            }
        }
        System.out.println("===========");
        for(int num : arrNumbers) {
            System.out.println(num);
        }

    }
}
