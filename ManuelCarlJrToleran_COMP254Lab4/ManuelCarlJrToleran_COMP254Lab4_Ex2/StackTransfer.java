import java.util.Stack;

public class StackTransfer {
    /**
     * Adds the popped elements of Stack S onto Stack T
     * @param S the stack with elements
     * @param T the stack to be populated with elements of Stack S
     */
    public static void transfer(Stack<Integer> S, Stack<Integer> T){
        int n = S.size();                   // store the size of Stack S
        for(int x = 0; x < n; x++){
            T.push(S.pop());                // add the popped elements of Stack S onto Stack T
        }
    }

    public static void main(String[] args) {
        // Creating Stacks
        Stack<Integer> S = new Stack<Integer>();
        Stack<Integer> T = new Stack<Integer>();

        // Add elements to Stack S. Top of Stack S is currently 42.
        S.push(4);
        S.push(8);
        S.push(15);
        S.push(16);
        S.push(23);
        S.push(42);

        // Displaying the Stacks before using the transfer method
        System.out.println("Before Transfer: ");
        System.out.println("S Stack: " + S);
        System.out.println("T Stack: " + T);

        // Transfer elements of Stack S onto Stack T using the transfer method
        transfer(S,T);

        // Displaying the Stacks after using the transfer method
        System.out.println("\nAfter Transfer: ");
        System.out.println("S Stack: " + S);
        System.out.println("T Stack: " + T);

    }

}
