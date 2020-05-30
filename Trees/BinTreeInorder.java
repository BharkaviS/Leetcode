/*
Given a binary tree, return the inorder traversal of its nodes' values.

(This can also be solved using stack)
Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
*/

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a = new ArrayList<Integer>();
        if(root!=null){
        
         dfs(root,a);
        }

        return a;
    }
    public void dfs(TreeNode root,List<Integer> a){
        if(root.left!=null){
            dfs(root.left,a);
        }
        a.add(root.val);
        if(root.right!=null){
            dfs(root.right,a);
        }
    }
    
}
