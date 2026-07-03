// Problem: Find Numbers with Even Number of Digits
// Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Pattern: Arrays / Basics
//
// Approach:
// For every number, count its digits by repeatedly dividing it by 10.
// If the digit count is even, increase the answer count.
//
// Time Complexity: O(n × d), where d is the number of digits in a number
// Space Complexity: O(1)

package Leetcode;

public class Q1295 {
    public static boolean evendigits(int num){
        int digitcount = 0;
        while(num !=0){
            num /=10;
            digitcount++;
        }
        return digitcount % 2 == 0;
    }

    public static int findnum(int nums[]){
        int evencount = 0;

        for(int i = 0; i<nums.length; i++){
            if(evendigits(nums[i])){
                evencount++;
            }
        }
        return evencount;
    }
    public static void main(String[]args){
        int nums[] = {12,345,2,6,7896};
        int count = findnum(nums);
        System.out.println(count);
    }
}
