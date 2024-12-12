import java.util.Collections;
import java.util.LinkedList;

public class LinkedListsortExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        //unsorted
        System.out.println("The Actual List is:"+list);
        //sort the list
        Collections.sort(list);
        //sorted
        System.out.println("The Sorted List is:"+list);
        //custom sorting
        Collections.reverse(list);
        System.out.println("The Reverse List is:"+list);



    }
}
