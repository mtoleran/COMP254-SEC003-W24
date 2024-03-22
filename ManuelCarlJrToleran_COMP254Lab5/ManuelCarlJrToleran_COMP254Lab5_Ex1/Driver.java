public class Driver {
    public static void main(String[] args)
    {
        //create and populate a linked binary tree
        LinkedBinaryTree<String> videoGames = new LinkedBinaryTree();
        Position<String> root = videoGames.addRoot("Video Games");

        Position<String> indie = videoGames.addLeft(root, "Indie");
        Position<String> tripleA = videoGames.addRight(root, "Triple A");
        Position<String> stardewValley = videoGames.addLeft(indie, "Stardew Valley");
        Position<String> undertale = videoGames.addRight(indie, "Undertale");

        // print linked binary tree
        System.out.println("--Video Games Linked Binary Tree--");
        parenthesize(videoGames, root);

        // print
        System.out.println("\n\n--Preorder traversal--");
        System.out.println("Position next to 'Indie': " + videoGames.preorderNext(indie).getElement());
        System.out.println("Position next to 'Triple A': " + videoGames.preorderNext(tripleA));

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
    //
    public static <E> void printPreorder(AbstractTree<E> T) {
        for (Position<E> p : T.preorder())
            System.out.println(p.getElement());
    }//
}
