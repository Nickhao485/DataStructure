package p3;

public class TreeTraverseReal {
    public static void main(String args[]) {
        TreeTraverse traverse = new TreeTraverse();
        TreeTraverse.Node root = traverse.generateNode();
        traverse.preOrder(root);
//        Node node7 = new Node(null,null,7);
//        Node node8 = new Node(null,null,8);
//        Node node5 = new Node(node7,node8,5);
//        Node node4 = new Node(null, null, 4);
//        Node node2 = new Node(node4, node5, 2);
//        return node2;
    }
}
