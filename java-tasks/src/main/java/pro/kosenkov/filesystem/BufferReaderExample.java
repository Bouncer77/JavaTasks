package pro.kosenkov.filesystem;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class BufferReaderExample {

    public static void main(String[] args) {

        BufferedReader br = null;
        FileInputStream fis = null;
        Scanner sc = null;
        InputStreamReader isr = null;
        Path path = null;

        String inputFileName = "java-tasks/src/main/java/pro/kosenkov/filesystem/text.txt";
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
