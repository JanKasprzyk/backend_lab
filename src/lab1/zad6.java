package lab1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;

import static lab1.zad1.readFile;

public class zad6 {

    public static void main(String[] args) {
        String fileContent = readFile("src/lab1/file.txt");
        String[] lines = fileContent.split(System.lineSeparator());
        for(int i=0; i< lines.length; i++)
        {
            System.out.println((i+1) + "\t" + lines[i]);
        }
    }
}
