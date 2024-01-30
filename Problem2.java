
public class Problem2 {
	public static void main(String[] args) {
	
		int x = 1;
		int y = 4;
		
		String hi = (y % 2 == 0) ? "Even":"Odd";
		String hello = (x % 2 == 0) ? "Even":"Odd";
		System.out.println(y + " Is " + hi);
		System.out.println(x + " Is " + hello);
	}
}
