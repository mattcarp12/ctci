/*
    CTCI 3.1 - Implement three stacks using a single array.

    This implementation dynamically populates the array with items added to each stack.
    The push operation searches for the next empty position in the array, then pushes there.
    Thus, push is O(n) time complexity, but O(1) space.
    In the book, Gayle proposes an alternative implementation that is  O(1) time and O(n) space, but I like
    this way better.
    Note that this can be trivially generalized to n stacks instead of three.
 */

public class ctci_3_1 {

    public class stackNode {
        int prev;
        int data;
        public stackNode(int p, int d) {
            prev = p;
            data = d;
        }
    }

    stackNode[] arr;
    int[] top;
    int nextIndex;

    public ctci_3_1(int size) {
        arr = new stackNode[size];
        top = new int[]{-1, -1, -1};
        nextIndex = -1;
    }

    public void push(int value, int stackNum) {
        int count = 0;
        while(arr[(++nextIndex) % arr.length] != null) {
            count++;
            if (count > arr.length) {
                System.out.println("Stack overflow!");
                return;
            }
        }
        nextIndex %= arr.length;
        arr[nextIndex] = new stackNode(top[stackNum], value);
        top[stackNum] = nextIndex;
    }

    public int pop(int stackNum) {
        if(isEmpty(stackNum)) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int prev = arr[top[stackNum]].prev;
            int data = arr[top[stackNum]].data;
            arr[top[stackNum]] = null;
            top[stackNum] = prev;
            return data;
        }
    }

    public int peek(int stackNum) {
        return arr[top[stackNum]].data;
    }

    public boolean isEmpty(int stackNum) {
        return (top[stackNum] == -1);
    }

    public static void main(String args[]) {
        ctci_3_1 test = new ctci_3_1(10);
        for(int i = 0; i < 5; i++) {
            test.push((int)(Math.random() * 100), (int)(Math.random() * 10) % 3);
        }
        for(int i = 0; i < 5; i++) {
            System.out.println(test.pop((int)(Math.random() * 10) % 3));
        }
        for(int i = 0; i < 10; i++) {
            test.push((int)(Math.random() * 100), (int)(Math.random() * 10) % 3);
        }
    }
}
