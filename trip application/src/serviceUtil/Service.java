package serviceUtil;

import util.Util;
import java.util.LinkedList;

import main.Cities;
public class Service {

	public static void menu1() {
		String info = Util.getInfo();
		System.out.println(info);
		System.out.println("Welcome...");
		String dest = Util.getString("Enter the destination you want to go..");
		String upperCity = dest.toUpperCase();
		System.out.println("Checking trips for "+upperCity);
		Cities city = new Cities();
		LinkedList<String> list = city.getlist();
		if(list.contains(upperCity)) {
			System.out.println("There are available trips for "+upperCity);
			String tripinfo = Util.filltripInfo();
			System.out.println(tripinfo);
		}
		
		else {
			System.out.println("There are no available trips for "+upperCity + " these are the active trips");
			for(String s:list) {
				System.out.println(s);
			}
			}
		}
	
	
	public static void menu2() {
		String info = Util.getInfo();
		System.out.println(info);
		String carType = Util.getString("Enter the type of vehicle");
		String whereTo = Util.getString("Enter where to go");
		String whereFrom = Util.getString("Enter your current location");
		int pass = Util.getInteger("Enter the number of passengers");
		String requires = Util.getString("Enter requires for eg SMOKKING:yes/no," + "LUGGAGE:yes/no, PET:yes/no");
		
		System.out.println("car type: "+carType+" from "+whereFrom+" to "+whereTo+" with "+pass+" number of passengers and requirements "+requires);
	}
	
	
	public static void menu3() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}

