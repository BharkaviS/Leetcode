/*

Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int lp=0,rp=numbers.length-1;
        while(lp<rp){
            if(numbers[lp]+numbers[rp]==target){
                res[0] = lp+1;
                res[1] = rp+1;
                break;
            }
            else if(numbers[lp]+numbers[rp]>target){
                rp--;
            }
            else if(numbers[lp]+numbers[rp]<target){
                lp++;
            }
        }
        return res;
    }
}
