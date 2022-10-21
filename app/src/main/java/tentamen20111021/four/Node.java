package tentamen20111021.four;

public class Node implements BinaryTree {
    private Object data;
    private BinaryTree left, right;

    public Node(Object data, BinaryTree left, BinaryTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public void printNodes() {
        left.printNodes();
        System.out.println(data);
        right.printNodes();
    }

}
