import java.io.*;
import java.util.*;

public class exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the path: ");
        String path = sc.nextLine();
        File f = new File(path);
        if(f.exists()){ //check if path exist
            if(f.isDirectory()){
                System.out.println("This is a Directory");
            }
            else {
                System.out.println("This is a file");
            }
        }
        else{
            System.out.println("This path is not exist");
        }
    }
}
