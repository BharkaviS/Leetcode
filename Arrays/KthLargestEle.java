/*

Find the kth largest element in an unsorted array. 
Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:
Input: [3,2,1,5,6,4] and k = 2
Output: 5

Example 2:
Input: [3,2,3,1,2,4,5,5,6] and k = 4
Output: 4

*/

class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        nums.sort(reverse = True)
        max = nums[0] ;
        k-=1
        for i in range(1,len(nums)):
            if(max>=nums[i] and k>0):
                max = nums[i]
                k-=1
        return max
