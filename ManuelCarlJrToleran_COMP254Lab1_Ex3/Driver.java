public class Driver {
    //main method
    public static void main(String[] args)
    {
        //clone a populated list
        System.out.println("\n--Clone a populated list--");
        CircularlyLinkedList<String> circularList = new CircularlyLinkedList<String>();
        circularList.addFirst("RBC");
        circularList.addLast("TD");
        circularList.addLast("BMO");
        circularList.addLast("Scotiabank");
        circularList.addLast("CIBC");
        circularList.addLast("NBC");

        System.out.println("Original");
        System.out.println(circularList);

        System.out.println("\nCopy");
        CircularlyLinkedList<String> copy = circularList.clone();
        System.out.println(copy);

        //clone an empty list
        System.out.println("\n--Clone an empty list--");
        CircularlyLinkedList<String> circularList2 = new CircularlyLinkedList<String>();
        CircularlyLinkedList<String> copy2 = circularList2.clone();
        System.out.println(copy2);
    }
}
