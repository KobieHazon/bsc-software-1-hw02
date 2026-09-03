public class Assignment02Q01Sec01 {
    public static void main(String[] args) {
        for (String item : args) {
            char value = item.charAt(0);
            if (value % 2 != 0) {
                System.out.println(value);
            }
        }
    }
}
