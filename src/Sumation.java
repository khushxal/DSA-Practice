public class Sumation {
    static double sumationProblem(int n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += (i / factorial(i + 1));
        }
        return sum;
    }

    static double factorial(double num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(
                sumationProblem(3));
    }
}