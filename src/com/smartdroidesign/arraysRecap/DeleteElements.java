package com.smartdroidesign.arraysRecap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElements {

    // Try to make it without using an index


    public static void main(String[] args) {
        int size = 6;
        int[] myArray = {50, 25, 66, 54, 31, 100, 29, 84};
        int[] newArray = new int[size];
        int pos = 5;

        for (int i = pos; i <size ; i++) {
            myArray[i] = myArray[i+1];
        }

        for (int i = 0; i <size ; i++) {
            newArray[i] = myArray[i];
            System.out.println(newArray[i]);
        }
    }
}
