import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String>linkedlist = new LinkedList<String>();
        linkedlist.add("A");
        linkedlist.add("B");
        linkedlist.add("C");
        linkedlist.add("D");
        linkedlist.add("E");
        System.out.println("linked List Content:" + linkedlist);
        linkedlist.addFirst("F");
        linkedlist.addLast("G");
        System.out.println("linked List Content after addition:" + linkedlist);
        //get and set values
        Object firstvar = linkedlist.get(1);
        System.out.println("first variable :" + firstvar);
        linkedlist.set(2,"changed Third Element");
        Object firstvar2 = linkedlist.get(2);
        System.out.println("First element after updated by set method:"+firstvar2);

        //Remove first and last element
        linkedlist.set(2,"changed Third Element");
        linkedlist.remove(2);
        System.out.println("removed element after updated by set method:"+linkedlist);

    }
}