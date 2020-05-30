/*
Given a binary tree, return the postorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [3,2,1]
*/

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a = new ArrayList();
        if(root!=null){
            dfs(root,a);
        }
        return a;
    }
    public void dfs(TreeNode root,List<Integer> a){
        if(root.left!=null){
            dfs(root.left,a);
        }
        if(root.right!=null){
            dfs(root.right,a);
        }
        a.add(root.val);
    }
}
