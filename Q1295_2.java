// Problem: Find Numbers with Even Number of Digits
// Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Pattern: Arrays / Basics
//
// Approach:
// Check whether each number lies in a range that has an even number of digits:
// 10–99 (2 digits), 1000–9999 (4 digits), or 100000 (6 digits).
// If it does, increment the even-number count.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

package Leetcode;

public class Q1295_2 {

    public static int findnum(int[] nums) {
        int evencount = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] >= 10 && nums[i] <= 99)
                    || (nums[i] >= 1000 && nums[i] <= 9999)
                    || (nums[i] == 100000)) {

                evencount++;
            }
        }

        return evencount;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896,5555};

        int count = findnum(nums);
        System.out.println(count);
    }
}
