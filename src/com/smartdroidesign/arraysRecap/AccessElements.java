// This is a recap of the main things you need to know about arrays

package com.smartdroidesign.arraysRecap;

public class AccessElements {

    public static void main(String[] args) {

        // 1. how to access/update an element in an array

        int[] intArray = new int[10];

        intArray[0] = 0;
        intArray[1] = 1;
        intArray[2] = 2;
        intArray[3] = 3;
        intArray[4] = 4;
        intArray[5] = 5;
        intArray[6] = 6;
        intArray[7] = 7;
        intArray[8] = 8;
        intArray[9] = 9;

        for (int i = 0; i <intArray.length ; i++) {
            System.out.println(intArray[i]);
        }


        // 2. You can avoid the declaration and repeated code using an array initializer

        int[] intArray2 = {1,2,3,4,5,6,7,8,9,10};

        intArray2[2] = 51;


        for (int i = 0; i <intArray2.length ; i++) {
            System.out.println(intArray2[i]);
        }

        // 3. In most cases, the use of an enhanced for loop is recommended and less cumbersome

        int[] intArray3 = {1,2,3,4,5,6,7,8,9,10};

        for (int x : intArray3) {
            System.out.println(x);
        }
    }
}
