import java.util.Arrays;

public class Tree {

    public static class Node<T> {
        T value;
        Node left;
        Node right;

        public Node(T value) {
            this.value = value;
            left = right = null;
        }

        public Node() {
            value = null;
            left = right = null;
        }
    }

    Node root;

    public Tree(){
        root = new Node();
    }


    public static <T> Node sorted_array_to_binary_tree(T[] arr) {
        int n = arr.length;
        Node<T> node = new Node();
        if (n == 1 || n == 2) {
            node.value = arr[0];
            if (n == 2) {
                node.right = new Node(arr[1]);
            }
            return node;
        }
        int mid = n / 2;
        node.value = arr[mid];
        node.left = sorted_array_to_binary_tree(Arrays.copyOfRange(arr, 0, mid));
        node.right = sorted_array_to_binary_tree(Arrays.copyOfRange(arr, mid + 1, n));
        return node;
    }

    public static void main (String[] args) {
        Tree myTree = new Tree();
        Integer[] arr = {0, 2, 3, 5, 8, 20};
        myTree.root = sorted_array_to_binary_tree(arr);
    }
}
