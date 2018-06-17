package com.smartdroidesign.arraysRecap;

// How to search for elements in an array by typing their values.

import java.util.Scanner;

public class SearchElements {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = {50, 25, 66, 54, 31, 100, 29, 84};
        System.out.println("Enter number to search: ");
        int position = 0;
        int searchedValue = scanner.nextInt();
        boolean found = false;

        while ((position < myArray.length) && (!found)) {
            if (myArray[position] == searchedValue) {
                found = true;
            } else {
                position++;
            }
        }
        if (found) {
            System.out.println("Item " + searchedValue + " found at position " + position);
        } else {
            System.out.println("Not found");
        }
    }
}
