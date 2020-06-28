/*

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
For example:

Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
   
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]

*/

class Solution {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        LevelOrder(root,arr,0);
        return arr;
    }
    
    public void LevelOrder(TreeNode root,List<List<Integer>> arr,int h){
        if(root==null){
            return;
        }
        if(h>=arr.size()){
            arr.add(new ArrayList<>());
        }
        arr.get(h).add(root.val);
        LevelOrder(root.left,arr,h+1);
        LevelOrder(root.right,arr,h+1);
    }
}
