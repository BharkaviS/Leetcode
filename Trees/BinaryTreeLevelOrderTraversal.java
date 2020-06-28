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
    
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        if(lh<rh){
            return rh+1;
        }
        return lh+1;
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        int d = height(root);
        for(int i=1;i<=d;i++){
            List<Integer> a = new ArrayList<Integer>(); 
            arr.add(LevelOrder(root,i,a));
        }
        return arr;
    }
    public List<Integer> LevelOrder(TreeNode root, int level,List<Integer> a){
        if(level==1){
            a.add(root.val);
        }
        else if(level>1){
            if(root.left!=null){
            LevelOrder(root.left,level-1,a);
            }
            if(root.right!=null){
            LevelOrder(root.right,level-1,a);
            }
        }
      
        return a;
   }
}
