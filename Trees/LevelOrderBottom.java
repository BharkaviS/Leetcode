/*

Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
For example:

Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7

return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]

*/

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        LevelOrderBot(root,arr,0);
        return arr;
    }
    
    public void LevelOrderBot(TreeNode root,List<List<Integer>> arr,int d){
        if(root == null){
            return ;
        }
        if(d>=arr.size()){
            arr.add(0,new ArrayList<>());
        }
        arr.get(arr.size()-d-1).add(root.val);
        
        LevelOrderBot(root.left,arr,d+1);
        LevelOrderBot(root.right,arr,d+1);
    }
}
