public class Driver {
    public static void main (String[] args)
    {
        //create a Binary Search Tree and make a search
        TreeMap<Integer,String> map = new TreeMap<Integer,String> ();
        map.put(6, "A");
        map.put(2, "B");
        map.put(4, "C");
        map.put(1, "D");
        map.put(9, "E");
        map.put(8, "F");
        //search
        System.out.println(map.get(4));
        System.out.println(map.higherEntry(2));
        //print the values
        for(String value : map.values())
        {
            System.out.println(value);
        }
        //print the root element
        System.out.println("root: "+map.root().getElement());
        //print both keys and values
        System.out.println(map.entrySet());
        //prints elements in increasing order by keys
        for (Position<Entry<Integer,String>> p : map.tree.inorder())
            System.out.println(p.getElement());
        map.dump();

        //remove the tree node with key 1
        map.remove(1);
        map.dump();
        //insert (4, "COMP")
        //insert (11, "SET")
        //print it again
        map.put(4, "COMP");
        map.put(11, "SET");
        map.dump();
        //get element with key 11
        System.out.println(map.get(11));

    }
}
