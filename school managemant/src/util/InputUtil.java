package util;

import java.util.Scanner;

import main.Student;
public class InputUtil {
	public static int getInt(String title) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(title);
		int num = scanner.nextInt();
		
		return num;
	}
	
	public static String getString(String title) {
		System.out.println(title);
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		return str;
	}
	
	public static Student fill() {
		String name = InputUtil.getString("Enter student name");
		String surname = InputUtil.getString("Enter student surname");
		int age = InputUtil.getInt("Enter student age");
		String div = InputUtil.getString("Enter student division");
		
		return new Student(name,surname,age,div);
	}
}
