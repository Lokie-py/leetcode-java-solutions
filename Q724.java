// Problem: Find Pivot Index
// Link: https://leetcode.com/problems/find-pivot-index/
// Pattern: Arrays / Prefix Sum
//
// Approach:
// First, calculate the total sum of the array.
// While traversing, lsum stores the sum of elements on the left.
// The right sum is calculated as total sum minus left sum minus the current element.
// If both sums are equal, the current index is the pivot index.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

package Leetcode;

public class Q724 {

        public int pivotIndex(int[] nums) {
            int rsum = 0;
            for(int i=0; i<nums.length; i++){
                rsum+=nums[i];
            }

            int lsum =0;
            for(int i = 0; i<nums.length; i++){
                if(lsum == rsum - nums[i]){
                    return i;
                }else{
                    lsum += nums[i];
                    rsum -= nums[i];
                }
            }
            return -1;
        }
        public void main(String[] args){
            int nums[] = {1,7,3,6,5,6};
            int fn = pivotIndex(nums);
            System.out.println(fn);
        }
}
