/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  ArraySum.java
 *   Project:  Array Sum Calculator
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package arrays;

/**
 * This class calculates the sum of elements in an array.
 */
public class ArraySum {

    /**
     * This method calculates the sum of elements in an array.
     * 
     * @param arr The array whose elements' sum is to be calculated.
     * @return The sum of elements in the array.
     */
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    /**
     * The main method to test the calculateSum method.
     * 
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int sum = calculateSum(array);
        System.out.println("Sum of elements in the array: " + sum);
    }
}
