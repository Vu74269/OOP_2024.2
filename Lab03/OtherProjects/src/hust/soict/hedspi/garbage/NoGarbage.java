package hust.soict.hedspi.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws Exception {
        String filename = "C:\\\\Program Files (x86)\\\\CASIO\\\\ClassWiz Emulator Subscription\\\\fx-580VN X Emulator\\\\fx-580VN X Emulator.exe";
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
        
        long startTime = System.currentTimeMillis();

        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
            outputStringBuilder.append((char)b);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken (NoGarbage): " + (endTime - startTime) + "ms");
    }
}
