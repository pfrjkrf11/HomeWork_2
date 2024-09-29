public class task_5_38 {
    public static void main(String[] args) {

        double S = 0;
        double Rast = 0;

        for (int i = 1; i < 101; i++) {
            double k = i;
            S = S + 1 / k;

            if (i % 2 == 0) {
                Rast = Rast - 1 / k;
            } else {
                Rast = Rast + 1 / k;
            }
        }
        System.out.printf("Мужчина будет на расстоянии %.3f км от дома и пройдет %.3f км", Rast, S);


    }

}
