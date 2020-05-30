/*
Given a binary tree, return the preorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]
*/

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> a = new ArrayList();
        if(root!=null){
            dfs(root,a);
        }   
        return a;
    }
    public void dfs(TreeNode root,List<Integer> a){
        a.add(root.val);
        if(root.left!=null){
            dfs(root.left,a);
        }
        if(root.right!=null){
            dfs(root.right,a);
        }
    }
}
