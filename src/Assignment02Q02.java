public class Assignment02Q02 {
    public static void main(String[] args) {
        int terms = Integer.parseInt(args[0]);
        double approximation = 0.0;
        for (int i = 0; i < terms; i++) {
            double sign = (i % 2 == 0) ? 1.0 : -1.0;
            approximation += sign / (1 + (2 * i));
        }
        System.out.println(String.format("%.2f %.2f", Math.PI, approximation * 4));
    }
}
