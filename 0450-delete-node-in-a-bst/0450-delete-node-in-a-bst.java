/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root==null) return null;
        if(root.val == key){
            //no child
            if(root.right == null && root.left == null){
                return null;
            }
            if(root.right == null && root.left !=null)return root.left;
            if(root.right != null && root.left == null)return root.right;

            TreeNode node = helper(root.right, root);
            root.val = node.val;
        }
        else if(key > root.val){
            root.right = deleteNode(root.right,key);
        }else{
            root.left = deleteNode(root.left, key);
        }
        return root;
    }
    public TreeNode helper(TreeNode root, TreeNode parent){
        TreeNode curr = root;
        TreeNode pre = parent;
        while(curr.left!=null){
            pre = curr;
            curr = curr.left;
        }
        deleteNode(pre,curr.val);
        return curr;
    }
}