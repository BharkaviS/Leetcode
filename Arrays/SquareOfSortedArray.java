/*
Given an array of integers A sorted in non-decreasing order, 
return an array of the squares of each number, also in sorted non-decreasing order.

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]

(Using Two Pointer Technique)
=>Traverse the negative part of the array in reverse order and postive part of the array in increasing order.

*/


/* Sorting array and squaring*/
class Solution {
    public int[] sortedSquares(int[] A) {
        int i,k=0;
        int[] res = new int[A.length];
        for(i=0;i<A.length;i++){
            if(A[i]<0){
                A[i] = -1*A[i];
            }
        }
        Arrays.sort(A);
        for(i=0;i<A.length;i++){
            res[k++] = A[i]*A[i];
        }
        return res;
    }
}

/*Two Pointer Technique*/
class Solution {
    public int[] sortedSquares(int[] A) {
        int N = A.length;
        int j = 0;
        while (j < N && A[j] < 0)
            j++;
        int i = j-1;

        int[] ans = new int[N];
        int t = 0;

        while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            ans[t++] = A[j] * A[j];
            j++;
        }

        return ans;
    }
}
