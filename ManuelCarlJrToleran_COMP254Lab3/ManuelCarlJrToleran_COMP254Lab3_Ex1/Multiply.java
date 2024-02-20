public class Multiply {
    public static int product(int m, int n) throws IllegalArgumentException {
        if (m < 0 || n < 0) {
            throw new IllegalArgumentException();
        }
        if(m == 0 || n == 0){
            return 0;
        }
        else {
            return m + product(m,n-1);
        }
    }

    public static void main(String[] args){
        int m = 20;
        int n = 6;
        try{
            int product = product(m, n);
            System.out.println("The product of " + m + " and " + n + " is " + product);
        } catch(IllegalArgumentException e){
            System.out.println("Error: the product function is undefined for negative integers");
        }
    }
}
