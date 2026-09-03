
public class Assignment02Q02 {

	public static void main(String[] args) {
		int added = Integer.parseInt(args[0]);
		double sum = 0;
		while (added > 0) {
			sum += Math.pow(-1, Integer.parseInt(args[0]) - added) * (1.0 / (1 + (Integer.parseInt(args[0]) - added)*2));
			added--;
		}
		System.out.println(String.format("%.2f %.2f", Math.PI, sum*4));
	}

}
