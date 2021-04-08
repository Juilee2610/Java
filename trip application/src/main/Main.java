package main;
import java.util.Scanner;
import serviceUtil.Service;
import util.Util;
public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to idk Car application\n\tYOUR RIDE YOUR CHOICE");
		String nationality = Util.getString("Please enter your nationality foreign or regional");
		
		System.out.println("Enter your choice");
		System.out.println("1.Find ride\n2.Offer ride\n3.About us\n4.Quit");
		
		//enter your choice
		while(true) {
		int choice = Util.getInteger("Enter your choice");
		
		if(nationality.equalsIgnoreCase("foreign")) {
			System.out.println("Enter your passport id");
			String information = scanner.nextLine();
			System.out.println("Your passport is "+ information);
			Thread.sleep(2000);
		}
		else if(nationality.equalsIgnoreCase("regional")) {
			
		}
		else {
			System.out.println("Please enter valid nationality");
			continue;
		}
		
	//check for choice 
		
		if(choice==1) {
			Service.menu1();
			break;
		}
		else if(choice==2) {
			Service.menu2();
			break;
		}
		else if(choice==3) {
			System.out.println("The reckless years of one’s 20s are perhaps the most illuminating ones. There’s plenty to be learnt, a bevvy of experiences that temper you into the man/woman you become later. However, as you reach the respectable figure of 30, there is an air of nostalgia of leaving your youthful days behind. Hence, as the number of candles on my birthday cake was about to reach 30, my mind started wandering and I started looking for ways to etch a permanent mark on my life. Wanderlust struck me and all I wanted to do was get out of my comfort zone.\r\n" + 
					"\r\n" + 
					"Here are ten of the best road trips you can take"); 
		}
		else if(choice ==4) {
			System.out.println("Quitting from system");
			break; 
		}
		else {
			System.out.println("Enter valid option");
		}
		}
	}
}
