
public class StringArrayExample {

	public static void main(String[] args) {
		//create a string array
		String[] names = {"Alice", "Bob", "Charles", "David"};
		
		//Use a for loop to iterate over the elements in the array
		for(int i = 0; i < names.length; i++)
		{
			String name = names[i];
			System.out.println("Name at index " + i + ": " + name);
		}
		//problem 1
		String[] names2 = {"Alan", "Charles", "Bob", "Daisy"};
		
		boolean found = false;
		for(int i = 0; i < names.length; i++)
		{
			for(int j = 0; j < names2.length; j++)
			{
				String one = names[i];
				String two = names2[j];
				if(one.equals(two))
				{
					System.out.println("There is at least one shared name.");
					found = true;
					break;
				}
				if(i == 3 & j == 3)
				{
					System.out.println("There are no shared names");
				}
			}
			if(found == true)
			{
				break;
			}
		}	
	}
}
