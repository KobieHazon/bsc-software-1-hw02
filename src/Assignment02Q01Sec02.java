public class Assignment02Q01Sec02 {
    public static void main(String[] args) {
        for (String item : args) {
            int sum = 0;
            for (int i = 0; i < item.length(); i++) {
                sum += item.charAt(i);
            }
            System.out.println(sum);
        }
    }
}
