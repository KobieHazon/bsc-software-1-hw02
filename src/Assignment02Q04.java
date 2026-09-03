public class Assignment02Q04 {
    public static void main(String[] args) {
        System.out.println("The English ABC is:");
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter);
        }
        System.out.println();
        System.out.println("Now backwards:");
        for (char letter = 'z'; letter >= 'a'; letter--) {
            System.out.print(letter);
        }
    }
}
