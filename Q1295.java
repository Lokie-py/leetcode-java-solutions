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
