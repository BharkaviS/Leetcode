/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/

class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int[] dparray = new int[n+1];
        int i;
        dparray[1] = 1;
        dparray[2] = 2;
        for(i=3;i<=n;i++){
            dparray[i] = dparray[i-1]+dparray[i-2];
        }
        return dparray[n];
    }
}
