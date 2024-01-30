
public class StringComparisonExample {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		//using ==
		System.out.println("Using == operator:");
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1 == str3: " + (str1 == str3));

		//using .equals()
		System.out.println("Using .equals() method:");
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str1.equals(str3): " + str1.equals(str3));
	}

}
