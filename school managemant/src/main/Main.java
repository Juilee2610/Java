package main;

import java.util.Scanner;

import util.InputUtil;
import util.MenuUtil;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Welcome to school management system"+"\n\t"+ "What you want to do"+
					"\n1.Regiter student"+
					"\n2.Show all students"+
					"\n3.Find student"+
					"\n4.Update student"+"\n5.Quit");
		
			int choice = InputUtil.getInt("Enter your choice");
		
			if(choice==1) {
				MenuUtil.menu1();
			}
		
			else if(choice == 2) {
				MenuUtil.menu2();
			}
		
			else if(choice ==3) {
				MenuUtil.menu3();
			}
		
			else if(choice == 4) {
				MenuUtil.menu4();
			}
			
			else if(choice == 5) {
				System.out.println("Quiting");
				break;
			}
		
			else {
				System.out.println("Please enter valid choice");
			}
		
		}
		
		
		
	}
}
