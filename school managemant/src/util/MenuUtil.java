package util;

import main.Configuration;
import main.Student;

public class MenuUtil {
	public static void menu1() {
		int no = InputUtil.getInt("How many students you want ot register");
		 Configuration.student = new Student[no];
		 for(int i=0;i<no;i++) {
			 System.out.println((i+1)+"Registration");
			 Student st = InputUtil.fill();
			 Configuration.student[i] = st;
		 }
		
	}
	
	public static void menu2() {
		if(Configuration.student==null) {
			System.out.println("You don't have any students");
		}
		else {
			for(int i=0;i<Configuration.student.length;i++) {
				Student st = Configuration.student[i];
				System.out.println((i+1)+"Student\n"+st.getInfo());
			}
		}
		
	}
	
	public static void menu3() {
		String find = InputUtil.getString("Enter name or suname of the student you want to find");
		for(int i=0;i<Configuration.student.length;i++) {
			Student st = Configuration.student[i];
			if(st.getName().equalsIgnoreCase(find)) {
				System.out.println(st.getInfo());
			}
		}
		
	}
	
	
	public static void menu4() {
		int student = InputUtil.getInt("Enter the student number you want to update");
		System.out.println("Enter new student information");
		Student st = InputUtil.fill();
		Configuration.student[student-1] = st;
		System.out.println(st.getInfo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
