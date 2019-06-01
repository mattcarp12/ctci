/*
Reverse a c-style string.
 */

public class ctci_1_2 {
    public static String reverse(String cString) {
        char[] arr = cString.toCharArray();
        reverse(arr, 0, arr.length - 2);
        return new String(arr);
    }

    public static void reverse(char[] arr, int start, int end) {
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(char[] arr, int p, int q) {
        char temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
    }
}
