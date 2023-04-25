import java.io.*;
import java.util.*;

public class exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the path: ");
        String path = sc.nextLine();
        System.out.println("Input the range: ");
        int n = sc.nextInt();
        File f = new File(path);
        if(f.exists()){
            File[] files = f.listFiles((dir, name) -> new File(dir, name).length() > n);
            if(files != null && files.length > 0) {
                System.out.println("List file have the extension are: ");
                for(File tmp : files){
                    System.out.println(tmp.getName());
                }
            }
            else{
                System.out.println("No file have the extension");
            }
        }
        else {
            System.out.println("This path is not exist");
        }
    }
}
