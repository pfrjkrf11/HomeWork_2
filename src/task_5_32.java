import java.util.Scanner;

public class task_5_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n:");
        int n = scanner.nextInt();

        double sum = 0f;

        for (int i = 1; i <= n; i++) {
            double s = i;

            double k = 1 / s;
            sum = sum + k;
        }
        System.out.printf("Ответ %.3f \n", sum);
    }
}
