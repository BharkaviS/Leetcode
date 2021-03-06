/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1=0,ptr2= 0;
        int max = m+n;
        int[] res = new int[max];
        int k=0,i;
        while(ptr1<m && ptr2<n){
            if(nums1[ptr1]<nums2[ptr2]){
                //stem.out.print(ptr1+" ");
                res[k++]=nums1[ptr1];
                ptr1++;
            }
            else{
                res[k++] = nums2[ptr2];
                ptr2++;
            }
        }
        while(ptr1<m){
            res[k++]= nums1[ptr1];
            ptr1++;
        }
        while(ptr2<n){
            res[k++] = nums2[ptr2];
            ptr2++;
        }
        for(i=0;i<res.length;i++){
            nums1[i]=res[i];
        }
}
}
