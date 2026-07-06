// Problem: Pascal's Triangle II
// Link: https://leetcode.com/problems/pascals-triangle-ii/
// Pattern: Arrays / 2D Array / Simulation
//
// Approach:
// Generate Pascal's Triangle row by row from row 0 to rowIndex.
// Every row starts with 1.
// Each middle element is the sum of two adjacent elements from the previous row.
// Every row except row 0 ends with 1.
// Store only the latest row in result, since previous rows are not needed after creating the next row.
//
// Time Complexity: O(rowIndex²)
// Space Complexity: O(rowIndex)


package Leetcode;
import java.util.*;
import java.util.ArrayList;

public class Q119 {

        public List<Integer> getRow(int rowIndex) {

            List<Integer> result = new ArrayList<>();

            for (int i = 0; i <= rowIndex; i++) {
                List<Integer> currentRow = new ArrayList<>();

                currentRow.add(1);

                for (int j = 1; j < i; j++) {
                    int value = result.get(j - 1) + result.get(j);
                    currentRow.add(value);
                }

                if (i > 0) {
                    currentRow.add(1);
                }

                result = currentRow;
            }

            return result;
        }

    public void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int rowIndex = sc.nextInt();

            List<Integer> getrow = getRow(rowIndex);
            System.out.println(getrow);
        }
    }
