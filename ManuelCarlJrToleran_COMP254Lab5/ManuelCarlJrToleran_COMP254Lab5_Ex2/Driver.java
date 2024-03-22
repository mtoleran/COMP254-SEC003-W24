public class Driver {
    public static void main(String[] args){
        // Create instance of tree
        SampleTree<String> storeTree = new SampleTree<>();
        // Create and add root of tree
        Position<String> root = storeTree.addRoot("International Computers");

        // Create and add Nodes of tree
        // children of root
        Position<String> sales = storeTree.addChild(root,"Sales");
        Position<String> manufacturing = storeTree.addChild(root,"Manufacturing");
        Position<String> research = storeTree.addChild(root,"R&D");
        // children of sales
        Position<String> usa = storeTree.addChild(sales,"US");
        Position<String> intl = storeTree.addChild(sales,"International");
        // children of intl
        Position<String> europe = storeTree.addChild(intl,"Europe");
        Position<String> asia = storeTree.addChild(intl,"Asia");
        Position<String> canada = storeTree.addChild(intl,"Canada");
        // children of manufacturing
        Position<String> laptops = storeTree.addChild(manufacturing,"Laptops");
        Position<String> desktops = storeTree.addChild(manufacturing,"Desktops");

        // Print the tree
        System.out.println("--INTERNATIONAL COMPUTERS TREE--");

        // Print element and height of each subtree
        parenthesize(storeTree, root);
        System.out.println("\n\n--Elements and Height of each subtree:--");
        storeTree.printElementAndHeight();
    }

    /** Prints parenthesized representation of subtree of T rooted at p. */
    public static <E> void parenthesize(Tree<E> T, Position<E> p) {
        System.out.print(p.getElement());
        if (T.isInternal(p)) {
            boolean firstTime = true;
            for (Position<E> c : T.children(p)) {
                System.out.print( (firstTime ? " (" : ", ") ); // determine proper punctuation
                firstTime = false;                             // any future passes will get comma
                parenthesize(T, c);                            // recur on child
            }
            System.out.print(")");
        }
    }
}
