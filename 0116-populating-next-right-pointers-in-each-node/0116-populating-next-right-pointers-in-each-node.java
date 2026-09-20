class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        Node L = root.left, R = root.right, N = root.next;
        if(L != null) {
            L.next = R;
            if(N != null) R.next = N.left;
            connect(L);
            connect(R);
        }
        return root;
    }
}