package code.review;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {

		Student s1 = new Student("Tom");
		Student s2 = new Student("Jerry");
		Student s3 = new Student("Rick");
		Student s4 = new Student("Morty");
		
		Student[] people = {s1, s2, s3, s4};
		
		s1.setAge(15);
		s2.setAge(17);
		s3.setAge(16);
		s4.setAge(18);
		
		s1.setGrade(-1);
		s1.setGrade(8);
		s1.setGrade(4);
		
		s2.setGrade(6);
		s2.setGrade(6);
		
		s3.setGrade(5);
		s3.setGrade(7);
		
		s4.setGrade(4);
		s4.setGrade(9);
		
		s1.setTalent("Junior class chess chamption 2015");
		s1.setTalent("Shotput 1st place 2015");
		s1.setTalent("Spelling bee winner 2013 1st place 2015");
		
		s3.setTalent("Newbie boxing champion 2014");
		s3.setTalent("Newbie chess 3rd place 2014");
		
		for(Student a : people) {
			a.printPerson();
		}
		
		for(Student a : people) {
			a.checkTalent("chess");
		}
		
		ArrayList<Student> classmates = s1.getClassmatesByAgeDesc();
		for(Student s : classmates) {
			System.out.println(s.name);
		}
		
	}

	
}
