import java.io.File;
import java.util.Scanner;

public class FileSystem {
    public static void find(File location, String fileName){
        if(location.isDirectory()){
            for (String childName : location.list()) {
                if(childName.equalsIgnoreCase(fileName)){
                    System.out.println(childName + " is found at " + location);
                }
                else {
                    File child = new File(location.getPath() + "\\" + childName);
                    if(child.isDirectory()) {
                        find(child, fileName);
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting location: ");
        String location = scanner.next();

        find(new File(location), "TOLERAN-MANUEL-CARL-CV.pdf");

    }
}
