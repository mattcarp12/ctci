import java.util.EmptyStackException;

public class Stack {

    public class Node {
        Comparable data;
        Node next;
        public Node(Comparable data) {
            this.data = data;
        }
    }

    int size;
    Node top;

    public Stack() {
        this.size = 0;
        this.top = null;
    }

    public void push(Comparable value) {
        Node newTop = new Node(value);
        newTop.next = top;
        top = newTop;
        size++;
    }

    public Comparable peek() {
        if (!isEmpty()) {
            return top.data;
        }
        throw new EmptyStackException();
    }

    public Comparable pop() {
        if (!isEmpty()) {
            Comparable value = top.data;
            top = top.next;
            size--;
            return value;
        }
        throw new EmptyStackException();
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
