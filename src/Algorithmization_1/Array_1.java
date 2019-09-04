package Algorithmization_1;
import java.util.Scanner;


public class Array_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity elements in the array: ");
        int n = scanner.nextInt();
        System.out.print("Enter number k: "); // для проверки на кратность данного числа
        int k = scanner.nextInt();
        int sum = 0;
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+ i + " value of the array: ");
            a[i] = scanner.nextInt();
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }
        System.out.println("Sum = " + sum);

    }
}






