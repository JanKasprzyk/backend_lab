package lab1;

import java.time.Instant;
import java.time.LocalDateTime;

public class zad5 {

    public static void main(String[] args) {
        System.out.println("UTC "+Instant.now().toString());
        System.out.println("Local "+ LocalDateTime.now());
    }
}