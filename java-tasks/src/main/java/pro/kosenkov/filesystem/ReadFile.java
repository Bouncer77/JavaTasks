package pro.kosenkov.filesystem;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadFile {

    public static void main(String[] args) {
        String inputFileName = "C:\\Projects\\JavaTasks\\JavaTasks\\java-tasks\\src\\main\\java\\pro\\kosenkov\\filesystem\\text.txt";


        // BufferedReader in = new BufferedReader(
        //           new InputStreamReader(new FileInputStream(fileDir), "UTF-8"));

        // BufferedReader reader = new BufferedReader(new FileReader(inputFileName, StandardCharsets.UTF_8))
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(inputFileName), "UTF-8"));) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
