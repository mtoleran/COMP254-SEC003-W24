import java.util.Iterator;

public class SampleTree<E> extends AbstractTree<E> {
    protected Node<E> createNode(E e, Node<E> parent) {
        return new Node<E>(e, parent);
    }

    // Sample Tree instance variables
    /** The root of the tree */
    protected Node<E> root = null;     // root of the tree

    /** The number of nodes in the tree */
    private int size = 0;              // number of nodes in the tree

    // constructor
    /** Construts an empty tree. */
    public SampleTree() { }      // constructs an empty tree

    // nonpublic utility
    /**
     * Verifies that a Position belongs to the appropriate class, and is
     * not one that has been previously removed. Note that our current
     * implementation does not actually verify that the position belongs
     * to this particular list instance.
     *
     * @param p   a Position (that should belong to this tree)
     * @return    the underlying Node instance for the position
     * @throws IllegalArgumentException if an invalid position is detected
     */
    protected Node<E> validate(Position<E> p) throws IllegalArgumentException {
        if (!(p instanceof Node))
            throw new IllegalArgumentException("Not valid position type");
        Node<E> node = (Node<E>) p;       // safe cast
        if (node.getParent() == node)     // our convention for defunct node
            throw new IllegalArgumentException("p is no longer in the tree");
        return node;
    }

    // accessor methods (not already implemented in AbstractBinaryTree)
    /**
     * Returns the number of nodes in the tree.
     * @return number of nodes in the tree
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns the root Position of the tree (or null if tree is empty).
     * @return root Position of the tree (or null if tree is empty)
     */
    @Override
    public Position<E> root() {
        return root;
    }

    /**
     * Returns the Position of p's parent (or null if p is root).
     *
     * @param p    A valid Position within the tree
     * @return Position of p's parent (or null if p is root)
     * @throws IllegalArgumentException if p is not a valid Position for this tree.
     */
    @Override
    public Position<E> parent(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getParent();
    }

    /**
     * Returns an iterable collection of the Positions representing p's children.
     *
     * @param p    A valid Position within the tree
     * @return iterable collection of the Positions of p's children
     * @throws IllegalArgumentException
     */
    @Override
    public Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getChildren();
    }

    /**
     * Places element e at the root of an empty tree and returns its new Position.
     *
     * @param e   the new element
     * @return the Position of the new element
     * @throws IllegalStateException if the tree is not empty
     */
    public Position<E> addRoot(E e) throws IllegalStateException {
        if (!isEmpty()) throw new IllegalStateException("Tree is not empty");
        root = createNode(e, null);
        size = 1;
        return root;
    }

    /**
     * Creates a new Child of Position p storing element e and returns its Position.
     *
     * @param p the Position which the new element is inserted in
     * @param e the new element
     * @return the Position of the new element
     * @throws IllegalArgumentException if p is not a valid Position for this tree
     */
    public Position<E> addChild(Position<E> p, E e)
            throws IllegalArgumentException {
        Node<E> parent = validate(p);
        Node<E> child = createNode(e, parent);
        parent.setChild(child);
        size++;
        return child;
    }

    /**
     * Prints the element and height of each subtree at Position p
     */
    public void printElementAndHeight(){
        for (Position<E> current : postorder()) {
            if (isInternal(current)) {
                System.out.println("Element: " + current.getElement() + " Height: " + height(current));
            }
            else if (isExternal(current)){
                System.out.println("Element: " + current.getElement() + " Height: " + height(current));
            }
        }
    }
}
