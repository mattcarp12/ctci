import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testCtci_1_2 {

    @Test
    public void testReverse() {
        assertEquals(ctci_1_2.reverse("foop"), "oofp");

        char[] arr = new char[]{'a', 'b', 'c', 'd', (char) 0};
        char[] exp = new char[]{'d', 'c', 'b', 'a', (char) 0};
        assertEquals(ctci_1_2.reverse(new String(arr)), new String(exp));
    }

}
