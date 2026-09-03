
public class Assignment02Q03 {

	public static void main(String[] args) {
		int sum = 0;
		int n = Integer.parseInt(args[0]);
		String str = "";
		System.out.println(String.format("The first %s Fibonacci numbers are:", n));
		int fib = 1;
		int prevFib = 1;
		while (n > 0) {
			str += prevFib + " ";
			sum += prevFib;
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
			n--;
		}
		System.out.println(str.substring(0, str.length() - 1));
		System.out.println("The sum is:");
		System.out.println(sum);
	}
	
}