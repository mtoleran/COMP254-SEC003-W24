public class Driver {
    public static void main (String[] args){
        SortedTableMap<Integer, String> students = new SortedTableMap<>();

        // populate map
        students.put(1,"Manuel");
        students.put(2,null);
        students.put(50,"Niko");
        students.put(20,"Forsen");
        students.put(35,"Jynxzi");
        students.put(5,"Midnite");
        students.put(3,"Sushi");
        students.put(4,"Yoru");
        students.put(10,"Felix");

        // test method
        System.out.println("Does Key 50 exist: " + students.containKey(50));
        System.out.println("Does Key 8 exist: " + students.containKey(8));
        System.out.println("Does Key 6 exist: " + students.containKey(6));
        System.out.println("Does Key 19 exist: " + students.containKey(19));
        System.out.println("Does Key 100 exist: " + students.containKey(100));
        System.out.println("Does Key 10 exist: " + students.containKey(10));
        System.out.println("Does Key 20 exist: " + students.containKey(20));
        System.out.println("Does Key 4 exist: " + students.containKey(4));

    }
}
