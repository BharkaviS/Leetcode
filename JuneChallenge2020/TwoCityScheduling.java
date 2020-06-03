/*

There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].

Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.

Example 1:
Input: [[10,20],[30,200],[400,50],[30,20]]
Output: 110
Explanation: 
The first person goes to city A for a cost of 10.
The second person goes to city A for a cost of 30.
The third person goes to city B for a cost of 50.
The fourth person goes to city B for a cost of 20.

The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.

*/

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        int i,ans = 0;
        for(int[] cost : costs){
            if(cost[0]<cost[1]){
                ans += cost[0];
                B.add(cost[1]-cost[0]);
            }
            else{
                ans += cost[1];
                A.add(cost[0]-cost[1]);
            }
        }
        if(A.size()>B.size()){
            Collections.sort(A);
            for(i=0;i<costs.length/2 - B.size() ;i++){
                ans += A.get(i);
            }
        }
        else if(B.size()>A.size()){
            Collections.sort(B);
            for(i=0;i<costs.length/2 - A.size() ;i++){
                ans += B.get(i);
            }
        }
        return ans;
        
    }
}
