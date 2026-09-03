
public class Assignment02Q01Sec01 {

	public static void main(String[] args) {
		for (String item: args) {
			if ((int)item.charAt(0) % 2 != 0) {
				System.out.println(item.charAt(0));
			}
		}

	}

}
