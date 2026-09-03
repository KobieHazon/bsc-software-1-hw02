
public class Assignment02Q01Sec03 {

	public static void main(String[] args) {
		int cnt = 0;
		for (String item: args) {
			if ((Integer.parseInt(item)) % 3 == 1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
