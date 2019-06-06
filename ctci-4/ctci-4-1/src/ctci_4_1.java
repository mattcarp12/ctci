public class ctci_4_1 {

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>(0);
        tree.right = new Tree<>(1);
        tree.left = new Tree<>(2);
        System.out.println(tree.isLeaf());
        System.out.println(tree.isBalanced());
        System.out.println(tree.left.isLeaf());
        tree.right.right = new Tree<>(3);
        tree.right.right.right = new Tree<>(4);
        System.out.println(tree.height());
        System.out.println(tree.isBalanced());
    }
}
