import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int height = data.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        data.close();
    }
}
