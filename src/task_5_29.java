public class task_5_29 {
    public static void main(String[] args) {

        int sum = 0;
        double aref = 0;
        double k = 0;

        for (int i = 1; i < 1001; i++) {
            k = k + 1;

            sum = sum + i;
            aref = sum / k;
        }
        System.out.println(aref);
    }
}
