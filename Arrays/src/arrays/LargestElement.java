/********************************************************************************************
 *   COPYRIGHT (C) 2022 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  LargestElement.java
 *   Project:  Array Operations
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package arrays;

/**
 * This class finds the largest element in an array.
 */
public class LargestElement {

    /**
     * This method finds the largest element in an array.
     * 
     * @param arr The array in which to find the largest element.
     * @return The largest element in the array.
     */
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * The main method to test the findLargest method.
     * 
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        int[] array = { 1, 3, 7, 2, 9, 5 };
        int largest = findLargest(array);
        System.out.println("Largest element in the array: " + largest);
    }
}
