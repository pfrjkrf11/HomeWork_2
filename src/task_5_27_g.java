import java.util.Scanner;

public class task_5_27_g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число а и b; через пробел:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;

        if (a >= b) {
            System.out.println("a больше либо равно b, повторите попытку!");
        } else {
            for (int i = a; i <= b; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }


    }
}
