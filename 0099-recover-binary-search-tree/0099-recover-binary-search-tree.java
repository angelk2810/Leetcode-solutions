class Solution {
    TreeNode first;
    TreeNode second;
    TreeNode prev;
    public void recoverTree(TreeNode root) {
        helper(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    void helper(TreeNode node) {
        if (node == null) return;
        helper(node.left);
        if (prev != null && prev.val > node.val) {
            if (first == null) {
                first = prev;
            }
            second = node;
        }
        prev = node;
        helper(node.right);
    }
}