package calculator;

import java.io.IOException;
import java.time.LocalDateTime;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Logger {
    private static final String FILE_NAME = "log.txt";

    public static void log(String operation, double a, double b, double result) throws IOException {
        String entry = String.format("%s | %f %s %f = %f", LocalDateTime.now(), a, operation, b, result);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(entry);
            writer.newLine();
        } catch (Exception e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
    }
}
