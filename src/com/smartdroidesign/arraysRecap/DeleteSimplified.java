package com.smartdroidesign.arraysRecap;

import java.util.Scanner;

public class DeleteSimplified {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myNumbers = new int[10];

        myNumbers[0] = 5;
        myNumbers[1] = 9;
        myNumbers[2] = 15;
        myNumbers[3] = 2;
        myNumbers[4] = 1;

        System.out.println("decide the size of the array");
        int logicalSize = scanner.nextInt();
        System.out.println("The arrays is: ");
        for (int i = 0; i <logicalSize ; i++) {
            System.out.println(myNumbers[i]);
        }


        System.out.println("Decide the number to delete");
        int target = scanner.nextInt();

        for (int i = target; i < logicalSize; i++) {
            myNumbers[i] = myNumbers[i + 1];
        }
        myNumbers[logicalSize - 1] = 0;
        logicalSize -- ;

        System.out.println("new array is: ");
        for (int i = 0; i <logicalSize ; i++) {
            System.out.println(myNumbers[i]);
        }

    }

}

/*
Code logic explained:

        // Make a size 10 array
3	    int[] myNumbers = new int[10];
4


        // add some values to it
5	    myNumbers[0] = 5;
6	    myNumbers[1] = 9;
7	    myNumbers[2] = 15;
8	    myNumbers[3] = 2;
9	    myNumbers[4] = 1;
10
        // Keeps track of how many elements are used
11	    int logicalSize = 5;

        // Element you wish to remove
12	    int target = 2;
13
        // Loop from the target to the logical end of the array
14	    for (int i = target; i<logicalSize; i++ ) {
        // Copy the next element into this position
15	      myNumbers[i] = myNumbers[i+1];
16	    }
        // Reset the last element to zero;
17	    myNumbers[logicalSize - 1] = 0;
        // Reduce the index by one
18	    logicalSize --;
19	  }
20	}
 */
