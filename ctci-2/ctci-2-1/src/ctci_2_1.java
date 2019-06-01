import java.util.HashSet;
import java.util.Set;

public class ctci_2_1 {

    // use hashset
    public static void remove_dups1(LinkedList L){
        LinkedList curr = L;
        LinkedList prev = null;
        Set s = new HashSet();

        while (curr != null) {
            if (s.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                s.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
    }


}
