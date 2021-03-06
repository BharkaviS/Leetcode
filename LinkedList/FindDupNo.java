/*
Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Example 1:

Input: [1,3,4,2,2]
Output: 2
Example 2:

Input: [3,1,3,4,2]
Output: 3
*/

/*Solution-1*/

class Solution {
    public int findDuplicate(int[] nums) {
        int i,max=0,res=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int[] count = new int[max+1];
        for(i=0;i<nums.length;i++){
            count[nums[i]]++;
            if(count[nums[i]]>1){
                res = nums[i];
            }
        }
        return res;
    }
}


/* Solution-2 :Floyd's Cycle Detection Algo */
class Solution {
  public int findDuplicate(int[] nums) {
    // Find the intersection point of the two runners.
    int tortoise = nums[0];
    int hare = nums[0];
    do {
      tortoise = nums[tortoise];
      hare = nums[nums[hare]];
    } while (tortoise != hare);

    // Find the "entrance" to the cycle.
    tortoise = nums[0];
    while (tortoise != hare) {
      tortoise = nums[tortoise];
      hare = nums[hare];
    }

    return hare;
  }
}
