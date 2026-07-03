// Problem: Max Consecutive Ones
// Link: https://leetcode.com/problems/max-consecutive-ones/
// Pattern: Arrays / Basics
//
// Approach:
// Traverse the array once and maintain a count of consecutive 1s.
// Reset the count to 0 whenever a 0 appears, and keep track of the maximum count.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

package Leetcode;

public class Q485 {
    public int findMaxConsecutiveOnes(int nums[]) {
        int counter = 0;
        int max = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                counter ++;
            }else{
                max = Math.max(max, counter);
                counter = 0;
            }
        }
        return  Math.max(max, counter);
    }

    public void main(String[] args){
       int nums[] = {1,1,1,1,0,1};
       int counter = findMaxConsecutiveOnes(nums);
        System.out.println(counter);
    }
}
