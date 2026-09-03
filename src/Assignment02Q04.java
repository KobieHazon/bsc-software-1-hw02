
public class Assignment02Q04 {
	public static void main(String[] args) {
		System.out.println("The English ABC is:"); char c = 'a';
		int i;
		for(i = 0; i<26; i++) {
			System.out.print(c);
			c++; 
		}
		System.out.println(); System.out.println("Now backwards:"); 
		do
		{
			System.out.print((char)(c - (27 - i))); 
			i--;
		}while (i > 0);
	}
}
