import java.io.*;
import java.util.*;

public class exam5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the path: ");
        String path = sc.nextLine();
        File f = new File(path);
        if(f.exists()){ //check if path exist
            BufferedReader reader = new BufferedReader((new FileReader(path)));
            int counter = 0;
            String line;
            while((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                counter += words.length;
            }
            reader.close();
            System.out.println("There are " + counter + " words in file");
        }
        else{
            System.out.println("This path is not exist");
        }
    }
}

