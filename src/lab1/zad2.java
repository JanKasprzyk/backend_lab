package lab1;

import java.io.*;

public class zad2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Wpisz coś: ");
        try {
            String text = br.readLine();
            writeToFile("src/lab1/file2.txt", text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String fileName, String text) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                boolean wasCreated = file.createNewFile();
                if(wasCreated) System.out.println("Utworzono plik");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileOutputStream stream = new FileOutputStream(file, false)) {
            byte[] contentInBytes = text.getBytes();
            stream.write(contentInBytes);
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
