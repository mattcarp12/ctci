public class TestMinStack {
    public static void main(String[] args) {
        MinStack testStack = new MinStack();
        testStack.push(10); System.out.println(testStack.min());
        testStack.push(20); System.out.println(testStack.min());
        testStack.push(30); System.out.println(testStack.min());
        testStack.push(5); System.out.println(testStack.min());
        testStack.push(30); System.out.println(testStack.min());
        testStack.push(1); System.out.println(testStack.min());
        testStack.push(1); System.out.println(testStack.min());
        testStack.push(1); System.out.println(testStack.min());
        testStack.push(-1); System.out.println(testStack.min());
        System.out.println("");

        int n = testStack.size();
        for (int i = 0; i < n + 1; i++) {
            testStack.pop();
            System.out.println(testStack.min());
        } //EmptyStackException at end is intentional


    }
}
