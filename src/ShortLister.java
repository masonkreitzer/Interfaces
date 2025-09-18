import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class ShortLister {
    public static void main(String[] args) {

        // Create JFileChooser to select file
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            Filter filter = new ShortWordFilter();

            try (Scanner scanner = new Scanner(selectedFile)) {
                while (scanner.hasNext()) {
                    String word = scanner.next();
                    if (filter.accept(word)) {
                        System.out.println(word);
                    }
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("No file selected.");
        }
    }
}
