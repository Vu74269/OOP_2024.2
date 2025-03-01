import java.util.Arrays;
import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
        	System.out.println("Nhập phần tử thứ " + (i+1) + " : ");
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / n;
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        scanner.close();
    }
}
