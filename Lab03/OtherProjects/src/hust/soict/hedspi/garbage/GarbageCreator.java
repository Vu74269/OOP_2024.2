package hust.soict.hedspi.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws Exception {
        String filename = "C:\\Program Files (x86)\\CASIO\\ClassWiz Emulator Subscription\\fx-580VN X Emulator\\fx-580VN X Emulator.exe";
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
        
        long startTime = System.currentTimeMillis();

        String outputString = "";
        for (byte b : inputBytes) {
            outputString = outputString + (char) b; 
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken (GarbageCreator): " + (endTime - startTime) + "ms");
    }
}
