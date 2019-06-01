/*
CTCI 1.4 - Determine if two strings are anagrams or not.
I will implement an algorithm to determind the edit distance of
two strings. Then, two strings are anagrams if their edit distance = 0;

 */


public class ctci_1_4 {

    public static boolean anagram(String s1, String s2) {
        return editDistance(s1, s2) == 0;
    }

    public static int editDistance(String s1, String s2) {
        /*
        1. Encode each string into an integer array of length 128, where each
            each entry of the array represents an ascii character, and the
            value at each entry is the number of times that letter appears in
            the string.
        2. To find the edit distance, loop through each array, summing the difference
            between each value in the two arrays (absolute value of difference).
            This is the edit distance.
         */
        s1.toLowerCase(); s2.toLowerCase();
        int[] a1 = new int[128];
        int[] a2 = new int[128];
        int editDist = 0;
//        for (int i = 0; i < 128; i++) {
//            a1[(int)s1.charAt(i)]++;
//            a2[(int)s2.charAt(i)]++;
//        }
        for (int i = 0; i < s1.length(); i++) {
            a1[(int)s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            a2[(int)s2.charAt(i)]++;
        }
        for (int i = 0; i < 128; i++) {
            editDist += Math.abs(a1[i] - a2[i]);
        }
        return editDist;
    }

}
