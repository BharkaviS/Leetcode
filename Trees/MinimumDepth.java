/*

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

*/

class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null || root.right==null){
            return minDepth(root.left)+minDepth(root.right)+1;
        }
        int lh = minDepth(root.left);
        int rh = minDepth(root.right);
        if(lh<rh){
            return lh+1;
        }
        return rh+1;
    }
}
