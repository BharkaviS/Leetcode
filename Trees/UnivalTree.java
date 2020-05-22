/*
A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.

Example 1:
Input: [1,1,1,1,1,null,1]
Output: true

Example 2:
Input: [2,2,2,5,2]
Output: false

*/

class Solution { 
    List<Integer> a = new ArrayList<Integer>();
    public boolean isUnivalTree(TreeNode root){
        dfs(root);
        for(int i : a){
            if(i != root.val){
                return false;
            }
        }
        return true;
    }
    public void dfs(TreeNode root) {
     if(root!=null){
         a.add(root.val);
         dfs(root.left);
         dfs(root.right);
     }
    }
}
