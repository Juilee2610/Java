package util;

import java.util.Scanner;
public class Util {
	static Scanner scanner = new Scanner(System.in);
	
	
	//get the string value 
	public static String getString(String title) {
		System.out.println(title);
		String get = scanner.nextLine();
		
		return get;
		
	}
	
	public static int getInteger(String title) {
		System.out.println(title);
		int answer = scanner.nextInt();
		
		return answer;
	}
	
	
	public static String getInfo() {
		
	    System.out.println("Enter your name and surname");
	    String name = scanner.nextLine();
	    System.out.println("Enter phone number");
	    String phone = scanner.nextLine();
	    System.out.println("Enter your email");
	    String email = scanner.nextLine();
		
		
		
		return "name: "+name+" phone number: "+phone+" email: "+email;
	}
	
	public static String filltripInfo() {
		String location = Util.getString("Enter your location");
		String pass = Util.getString("Enter number of passengers");
		String requires = Util.getString("Enter requires (for eg SMOKKING:yes/no, LUGGAGE:yes/no, PET:yes/no)");
		
		return "Your trip trip from location "+location+ " with passengers "+pass+" and requirements "+requires;
	}
	
	
	
	
}
