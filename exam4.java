import java.io.*;

public class exam4 {
    public static void main(String[] args) {
        File sourceFile = new File("C:\\Users\\503\\IdeaProjects\\TH_5\\src\\main\\java\\exam2.java");
        File destFile = new File("C:\\Users\\503\\IdeaProjects\\TH_5\\src\\main\\java\\copy.txt");

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[1024];
            int length;

            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}