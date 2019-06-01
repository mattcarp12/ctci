import org.junit.Test;
import static org.junit.Assert.*;


public class ctci_1_1 {

    public String S;

    //brute force technique
    public boolean unique1() {
        int n = S.length();
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (S.charAt(i) == S.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    // uses map
    public boolean unique2() {
        int[] check = new int[256];
        for (int i = 0; i < S.length(); i++) {
            check[(int) S.charAt(i)]++;
        }
        for (int i = 0; i < check.length; i++) {
            if (check[i] > 1) {
                return false;
            }
        }
        return true;
    }

    public String sort(String myStr) {
        if(myStr.length() == 1 || myStr.length() == 0) {
            return myStr;
        } else {
            int div = myStr.length()/2;
            return merge(sort(myStr.substring(0, div)), sort(myStr.substring(div)));
        }
    }

    public String merge(String s1, String s2) {
        StringBuffer S = new StringBuffer();
        int p1 = 0;
        int p2 = 0;
        int n1 = s1.length();
        int n2 = s2.length();

        while(p1 < n1 && p2 < n2) {
            if (s1.charAt(p1) <= s2.charAt(p2)) {
                S.append(s1.charAt(p1));
                p1++;
            } else {
                S.append(s2.charAt(p2));
                p2++;
            }
        }
        while(p1 < n1) {
            S.append(s1.charAt(p1));
            p1++;
        }
        while(p2 < n2) {
            S.append(s2.charAt(p2));
            p2++;
        }
        return S.toString();
    }

    //sort then step through
    public boolean unique3() {
        S = sort(S);
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
