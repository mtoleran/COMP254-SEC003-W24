import java.util.Comparator;

public class Driver {
    public static void main(String[] args)
    {
        //create an unsorted priority queue
        HeapPriorityQueue<String,String> heapQueue = new HeapPriorityQueue<String,String>();
        heapQueue.insert("47", "A");
        heapQueue.insert("75", "C");
        heapQueue.insert("28", "B");
        heapQueue.insert("51", "D");
        heapQueue.insert("31", "F");
        heapQueue.insert("22", "G");
        heapQueue.insert("15", "H");

        // list all entries
        System.out.println("All entries:");
        for (int i=0;i < heapQueue.size();i++)
            System.out.println("(" +heapQueue.heap.get(i).getKey() +
                    ", " + heapQueue.heap.get(i).getValue() + ")" );
        //get the minimum
        System.out.println("\nMinimum: " + heapQueue.min().getKey());
        //create a Comparator object
        Comparator<String> comp = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };
    }
}
