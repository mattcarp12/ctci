public class LinkedList<E> {

    E data;
    LinkedList<E> next;

    public LinkedList(E data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedList L = (LinkedList) o;
        return this.data.equals(L.data) &&
                ((this.next == null && L.next == null) || this.next.equals(L.next));
    }
}
