// Problem: Pascal's Triangle
// Link: https://leetcode.com/problems/pascals-triangle/
// Pattern: Arrays / 2D Array / Simulation
//
// Approach:
// Create the triangle row by row from row 0 to numRows - 1.
// Every row starts with 1.
// Each middle element is the sum of two adjacent elements from the previous row.
// Every row except row 0 ends with 1.
// Store every completed row in result and return the complete Pascal's Triangle.
//
// Time Complexity: O(numRows²)
// Space Complexity: O(numRows²)


package Leetcode;

import java.util.*;

public class Q118 {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> currentRow = new ArrayList<>();

            // First element of every row
            currentRow.add(1);

            // Middle elements
            for (int j = 1; j < i; j++) {
                List<Integer> previousRow = result.get(i - 1);

                int value = previousRow.get(j - 1) + previousRow.get(j);
                currentRow.add(value);
            }

            // Last element of every row except row 0
            if (i > 0) {
                currentRow.add(1);
            }

            result.add(currentRow);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        List<List<Integer>> triangle = generate(numRows);

        System.out.println(triangle);

        sc.close();
    }
}