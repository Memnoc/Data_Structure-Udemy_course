package com.smartdroidesign.BubbleSort;

// Implementation of the Bubble Sort algorithm (asc order) in arrays

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Bubble Sort implementation

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    /*
     - Takes the array you need to sort
     - Takes two indices, i and j
     - If you want to swap for ex. 3 and 4, you pass the array in and i for 3 and j for 4
     */
    private static void swap(int[] array, int i, int j) {
        if (i==j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
