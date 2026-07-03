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