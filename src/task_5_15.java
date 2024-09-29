import java.util.Scanner;

public class task_5_15 {
    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);

        System.out.print("Введите число n:");
        int n = sacnner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(i + " * " + n + " = " + n * i);
        }

    }
}
