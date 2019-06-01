import org.junit.Test;

import static org.junit.Assert.*;

public class test_ctci_1_1 {

    ctci_1_1 test = new ctci_1_1();

    @Test
    public void testSort() {
        assertEquals("awxyz", test.sort("zyxwa"));
        assertEquals("aaa", test.sort("aaa"));
        assertEquals("", test.sort(""));
    }

    @Test
    public void testUnique1() {
        test.S = "abc";
        assertTrue(test.unique1());
        test.S = "aaa";
        assertFalse(test.unique1());
        test.S = "";
        assertTrue(test.unique1());
    }

    @Test
    public void testUnique2() {
        test.S = "abc";
        assertTrue(test.unique2());
        test.S = "aaa";
        assertFalse(test.unique2());
        test.S = "";
        assertTrue(test.unique2());
    }

    @Test
    public void testUnique3() {
        test.S = "abc";
        assertTrue(test.unique3());
        test.S = "aaa";
        assertFalse(test.unique3());
        test.S = "";
        assertTrue(test.unique3());
    }
}
