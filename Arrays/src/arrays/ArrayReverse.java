/********************************************************************************************
 *   COPYRIGHT (C) 2022 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  ArrayReverse.java
 *   Project:  Array Reversal
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package arrays;

import java.util.Arrays;

/**
 * This class reverses the elements of an array.
 */
public class ArrayReverse {

    /**
     * This method reverses the elements of an array.
     * 
     * @param arr The array to be reversed.
     */
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move to the next pair of elements
            start++;
            end--;
        }
    }

    /**
     * The main method to test the reverseArray method.
     * 
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println("Original array: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
}
