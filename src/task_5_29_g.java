import java.util.Scanner;

public class task_5_29_g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа а и b через пробел:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        double aref = 0;
        double k = 0;

        if (a >= b) {
            System.out.print("a больше либо равно b, повторите попытку!");
        } else {
            for (int i = a; i <= b; i++) {
                k = k + 1;
                sum = sum + i;
                aref = sum / k;
            }
            System.out.printf("Среднее арифметическое всех целых чисел от %d до %d равно %.3f \n", a, b, aref);
        }
    }
}
