public class Assignment02Q05 {
    public static void main(String[] args) {
        int size = 6;
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if ((row + column) % 2 == 0) {
                    System.out.print("w " );
                } else {
                    System.out.print("b " );
                }
            }
            System.out.println();
        }
    }
}
