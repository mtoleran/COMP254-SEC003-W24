import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Node<E> implements Position<E> {
    private E element;          // an element stored at this node
    private Node<E> parent;     // a reference to the parent node (if any)
    private List<Position<E>> children;

    /**
     * Constructs a node with the given element and neighbors.
     *
     * @param e  the element to be stored
     * @param above       reference to a parent node
     */
    public Node(E e, Node<E> above) {
        element = e;
        parent = above;
        children = new ArrayList<>();
    }

    //get and set methods
    //
    // accessor methods
    public E getElement() { return element; }
    public Node<E> getParent() { return parent; }
    public Iterable<Position<E>> getChildren() { return children; }

    // update methods
    public void setElement(E e) { element = e; }
    public void setParent(Node<E> parentNode) { parent = parentNode; }
    public void setChild(Node<E> child) { children.add(child); }
}
