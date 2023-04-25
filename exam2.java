import java.io.*;
import java.util.*;
public class exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the path: ");
        String path = sc.nextLine();
        File f = new File(path);
        String extension = "java";
        if(f.exists()){
            File[] files = f.listFiles((dir, name) -> name.endsWith("." + extension));
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
