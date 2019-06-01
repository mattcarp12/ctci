import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testCtci_1_4 {

    @Test
    public void testEditDist() {
        assertEquals(ctci_1_4.editDistance("kitten", "sitting"), 3);
    }
}
