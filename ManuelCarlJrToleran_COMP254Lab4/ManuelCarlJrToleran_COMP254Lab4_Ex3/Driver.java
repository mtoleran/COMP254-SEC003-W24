public class Driver {
    public static void main(String[] args){
        // Create 2 LinkedQueues: original and Q2
        LinkedQueue<Integer> original = new LinkedQueue<>();
        LinkedQueue<Integer> Q2 = new LinkedQueue<>();

        // Populate the queues
        // original
        original.enqueue(55);
        original.enqueue(78);
        original.enqueue(36);
        original.enqueue(21);
        original.enqueue(80);
        // Q2
        Q2.enqueue(40);
        Q2.enqueue(33);
        Q2.enqueue(7);
        Q2.enqueue(11);
        Q2.enqueue(19);

        // Displaying the queues before using the concatenate method
        System.out.println("Before concatenate:");
        System.out.println("Original queue: " + original);
        System.out.println("Q2 queue: " + Q2);

        // Append Q2 to the of the original queue
        original.concatenate(Q2);

        // Displaying the queues after using the concatenate method
        System.out.println("\nAfter concatenate:");
        System.out.println("Original queue: " + original);
        System.out.println("Q2 queue: " + Q2);

    }
}
