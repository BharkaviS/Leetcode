/*

Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. 
You can only see the k numbers in the window. Each time the sliding window moves right by one position. Return the max sliding window.

Example:

Input: nums = [1,3,-1,-3,5,3,6,7], and k = 3
Output: [3,3,5,5,6,7] 

Explanation: 

Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
 
*/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        int max = 0;
        int i,j=0,x;
        for(i=0;i<k;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        res[j++]=max;
        for(i=1;i<=n-k;i++){
            if(nums[i-1]==max){
                max = -100000;
                for(x= i;x<i+k;x++){
                    if(max<nums[x]){
                        max = nums[x];
                    }
                }
            }
            else if (nums[i+k-1]>max){
                max = nums[i+k-1];
            }
            res[j++] = max;
        }
        return res;
    }
}
