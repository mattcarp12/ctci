public class MinStack  {

    public class minElement implements Comparable {
        Comparable data;
        int dup;
        public minElement(Comparable data) {
            this.data = data;
            dup = 0;
        }

        @Override
        public int compareTo(Object o) {
            return data.compareTo(o);
        }
    }

    Stack main;
    Stack min;

    public MinStack() {
        this.main = new Stack();
        this.min = new Stack();
    }

    public boolean isEmpty() {
        return main.isEmpty();
    }

    public int size() {
        return main.size;
    }

    public void push(Comparable value) {
        main.push(value);
        if (min.isEmpty()) {
            min.push(new minElement(value));
        } else {
            minElement top = (minElement) min.peek();
            if (value.compareTo(top.data) < 0) {
                min.push(new minElement(value));
            } else if (value.compareTo(top.data) == 0) {
                top.dup++;
            }
        }


    }

    public Comparable pop() {
        Comparable top = main.pop();
        minElement minTop = (minElement) min.peek();
        Comparable temp;
        if (top.compareTo(minTop.data) == 0) {
            if (minTop.dup == 0) {
                temp = min.pop();
            } else {
                minTop.dup--;
            }
        }
        return top;
    }

    public Comparable peek() {
        return main.peek();
    }

    public Comparable min() {
        minElement minTop = (minElement) min.peek();
        return minTop.data;
    }

}
