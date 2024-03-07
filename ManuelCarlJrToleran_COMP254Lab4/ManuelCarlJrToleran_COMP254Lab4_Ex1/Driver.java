import java.util.Iterator;

public class Driver {
    public static void main(String[] args){
        // Create instance of LinkedPositionalList
        LinkedPositionalList<Integer> linkedPositionalList = new LinkedPositionalList<>();

        // Populate list
        linkedPositionalList.addLast(20);
        linkedPositionalList.addLast(35);
        linkedPositionalList.addLast(51);
        linkedPositionalList.addFirst(42);
        linkedPositionalList.addLast(11);
        linkedPositionalList.addFirst(23);
        linkedPositionalList.addLast(88);

        // Print the list
        System.out.println(linkedPositionalList);

        // Positions to test
        // 2nd element in list
        Position<Integer> second = linkedPositionalList.after(linkedPositionalList.first());
        // 4th element in list
        Position<Integer> fourth = linkedPositionalList.after(linkedPositionalList.after(second));
        // 6th element in list
        Position<Integer> sixth = linkedPositionalList.before(linkedPositionalList.last());

        // Print index of 42 (2nd element)
        System.out.println("Index of 42: " + linkedPositionalList.indexOf(second));
        // Print index of 35 (4th element)
        System.out.println("Index of 35: " +linkedPositionalList.indexOf(fourth));
        // Print index of 11 (6th element)
        System.out.println("Index of 11: " +linkedPositionalList.indexOf(sixth));

    }
}
