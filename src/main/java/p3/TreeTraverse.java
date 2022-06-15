package p3;

public class TreeTraverse {
    class Node {
        private Node left;
        private Node right;
        private int value;

        public Node(Node left, Node right, int val) {
            this.left = left;
            this.right = right;
            value = val;
        }
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.value);
            System.out.println();
            preOrder(node.left);
            preOrder(node.right);
        }
    }

//    void preOrderIteration(Node node) {
//        stack.push(node);
//        while(!stack.isEmpty()) {
//            popNode = stack.pop();
//            print(popNOde.value);
//            if (popNode.left) {
//                preOrderIteration(popNode.left);
//            }
//        }
//    }

    public Node generateNode() {
        Node node7 = new Node(null,null,7);
        Node node8 = new Node(null,null,8);
        Node node5 = new Node(node7,node8,5);
        Node node4 = new Node(null, null, 4);
        Node node2 = new Node(node4, node5, 2);
        Node node6 = new Node(null, null, 6);
        Node node3 = new Node(null, node6, 3);
        Node node1 = new Node(node2, node3, 1);
        return node1;
    }


}
