public class Assignment02Q01Sec03 {
    public static void main(String[] args) {
        int count = 0;
        for (String item : args) {
            if (Integer.parseInt(item) % 3 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
