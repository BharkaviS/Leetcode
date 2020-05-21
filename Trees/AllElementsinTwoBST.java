/*
Given two binary search trees root1 and root2.

Return a list containing all the integers from both trees sorted in ascending order.

Example 1:
Input: root1 = [2,1,4], root2 = [1,0,3]
Output: [0,1,1,2,3,4]

Example 2:
Input: root1 = [0,-10,10], root2 = [5,1,7,0,2]
Output: [-10,0,0,1,2,5,7,10]

Example 3:
Input: root1 = [], root2 = [5,1,7,0,2]
Output: [0,1,2,5,7]

Example 4:
Input: root1 = [0,-10,10], root2 = []
Output: [-10,0,10]

Example 5:
Input: root1 = [1,null,8], root2 = [8,1]
Output: [1,1,8,8]

*/

class Solution {
    public void traversal(TreeNode root,List<Integer> L){
        L.add(root.val);
        if(root.left!=null){
            traversal(root.left,L);
        }
        if(root.right!=null){
            traversal(root.right,L);
        }
        
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> L = new ArrayList<Integer>();
        if(root1!=null)
        traversal(root1,L);
        if(root2!=null)
        traversal(root2,L);
        Collections.sort(L);
        return L;
    }
}
