public class Driver {
    //main method
    public static void main(String[] args)
    {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.addFirst("RBC");
        list.addLast("TD");
        list.addLast("BMO");
        list.addFirst("Scotiabank");
        list.addFirst("CIBC");
        list.addFirst("NBC");

        System.out.println("ORIGINAL");
        System.out.println(list);

        System.out.println("\nswap NBC, BMO");
        list.swapNodes("NBC", "BMO");
        System.out.println(list);

        System.out.println("\nswap Scotiabank, RBC");
        list.swapNodes("Scotiabank", "RBC");
        System.out.println(list);

        System.out.println("\nswap TD, CIBC");
        list.swapNodes("TD", "CIBC");
        System.out.println(list);

        System.out.println("\nswap Scotiabank, BMO");
        list.swapNodes("Scotiabank", "BMO");
        System.out.println(list);
    }
}
