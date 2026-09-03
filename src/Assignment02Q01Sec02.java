
public class Assignment02Q01Sec02 {

	public static void main(String[] args) {
		int sum = 0;
		for (String item: args) {
			for (int i = 0; i < item.length(); i++) {
				sum += (int)item.charAt(i);
			}
			System.out.println(sum);
			sum = 0;
		}
	}

}
