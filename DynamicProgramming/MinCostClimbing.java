/*

On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).

Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, 
and you can either start from the step with index 0, or the step with index 1.

*/

import java.util.*;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int f1 = 0;
        int f2 = 0;
        int i;
        int f0;
        for(i=cost.length-1;i>=0;i--){
            f0 = cost[i]+Math.min(f1,f2);
            f1 = f2;
            f2 = f0;
        }
        return Math.min(f1,f2);
    }
}
