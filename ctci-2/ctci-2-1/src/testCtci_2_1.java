import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testCtci_2_1 {

    @Test
    public void testRemove_dups1() {
        LinkedList<String> L_act = new LinkedList<String>("foo");
        L_act.next = new LinkedList<String>("bar");
        L_act.next.next = new LinkedList<String>("foo");
        LinkedList<String> L_exp = new LinkedList<String>("foo");
        L_exp.next = new LinkedList<String>("bar");
        ctci_2_1.remove_dups1(L_act);
        assertEquals(L_act, L_exp);

        L_act.next = new LinkedList<String>("foo");
        L_act.next.next = new LinkedList<String>("foo");
        L_exp.next = null;
        ctci_2_1.remove_dups1(L_act);
        assertEquals(L_act, L_exp);
    }


}
