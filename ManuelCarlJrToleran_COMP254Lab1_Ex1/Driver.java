public class Driver {
    //main method
    public static void main(String[] args)
    {
        DoublyLinkedList<String> L = new DoublyLinkedList<String>();
        DoublyLinkedList<String> M = new DoublyLinkedList<String>();

        L.addFirst("Cat");
        L.addLast("Dog");

        M.addFirst("Giraffe");
        M.addLast("Lion");

        System.out.println("L: "+ L);
        System.out.println("M: "+ M);
        L = DoublyLinkedList.connectDoublyLinkedLists(L, M);
        System.out.println("L + M: " + L + " Size: " + L.size());
    }
}
