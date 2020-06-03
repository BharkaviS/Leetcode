/*

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

*/

class Solution {
    public void moveZeroes(int[] nums) {
        int i,lp=0,rp=1;
        while(lp<nums.length && rp<nums.length ){
            if(nums[lp] == 0 && nums[rp] != 0){
                int temp = nums[lp];
                nums[lp] = nums[rp];
                nums[rp] = temp;
                lp++;
                rp++;
            }
            else if(nums[lp] == 0 && nums[rp]==0){
                rp++;
            }
            else{
                lp++;
                rp++;
            }
        }
    }
}
