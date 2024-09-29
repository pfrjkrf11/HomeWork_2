import java.util.Scanner;

public class task_5_28_g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число а и b через пробел:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long proizv = 1;

        if (a >= b) {
            System.out.println("a больше либо равно b, повторите попытку!");
        } else {
            for (int i = a; i <= b; i++) {
                proizv = proizv * i;
            }
            System.out.printf("Ответ:%d", proizv);
        }
    }

}
