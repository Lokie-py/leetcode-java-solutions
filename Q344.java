// Problem: Reverse String
// Link: https://leetcode.com/problems/reverse-string/
// Pattern: Two Pointers
//
// Approach:
// Use two pointers: one at the start and one at the end of the character array.
// Swap both characters, then move the start pointer forward
// and the end pointer backward.
// Continue until both pointers meet.
//
// Time Complexity: O(n)
// Space Complexity: O(1)


package Leetcode;

public class Q344 {
    public void rev_str(char[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    public void main(String[] args){
        char arr[] = {'H','E','L','L','O'};
        rev_str(arr);
        System.out.println(arr);
    }
}
