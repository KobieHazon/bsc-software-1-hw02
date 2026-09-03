public class Assignment02Q03 {
    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        int sum = 0;
        int current = 1;
        int previous = 1;
        StringBuilder sequence = new StringBuilder();

        System.out.println(String.format("The first %s Fibonacci numbers are:", count));
        for (int i = 0; i < count; i++) {
            if (i > 0) {
                sequence.append(' ');
            }
            sequence.append(previous);
            sum += previous;
            int next = current + previous;
            previous = current;
            current = next;
        }
        System.out.println(sequence);
        System.out.println("The sum is:");
        System.out.println(sum);
    }
}
