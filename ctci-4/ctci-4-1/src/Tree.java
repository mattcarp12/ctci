public class Tree<T> {
    T root;
    Tree<T> left;
    Tree<T> right;

    public Tree(T key) {
        this.root = key;
        this.left = null;
        this.right = null;
    }

    public boolean isLeaf() {
        return (left == null && right == null);
    }

    public int height() {
        if (isLeaf()) {
            return 0;
        }
        return 1 + Math.max(left == null ? 0 : left.height(),
                            right == null ? 0 : right.height());
    }

    public boolean isBalanced() {
        return (Math.abs((left == null ? 0 : left.height()) -
                (right == null ? 0 : right.height())) <= 1);
    }
}