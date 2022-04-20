package code.review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Student {

	private static int idcount;
	int id;
	String name;
	int age = 16;
	
	private ArrayList<Integer> Grade = new ArrayList<Integer>();
	
	private HashSet<String> talents = new HashSet<String>();
	
	private ArrayList<Student> classmates = new ArrayList<Student>();
	
	public Student(String name) {
		name = this.name;
		id = ++idcount;
		classmates.add(this);
	}
	
	public Student(String name, int age) {
		name = this.name;
		age = this.age;
		id = ++idcount;
		classmates.add(this);
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public ArrayList<Integer> getGrade(){
		return new ArrayList<Integer>(this.Grade);
	}

	public void setGrade(int grade) {
		if(grade > 0 && grade < 10) {
			Grade.add(grade);
		}else {
			System.out.println("Wrong values for a grade");
		}
	}
	
	public HashSet<String> getTalent(){
		return talents;
	}

	public void setTalent(String string) {
		talents.add(string);
		
	}
	
	void printPerson() {
		if(this.checkGifted() == true) {
			System.out.println(this.name + " is a " + this.age +" year old enrolled student, with the GPA of "+this.getAvgGrade() + ". Person has "+ this.talents.size()+" additional achievements.");
			System.out.println("Person is qualified for the gifted program!");
		}else {
			System.out.println(this.name + " is a " + this.age +" year old enrolled student, with the GPA of "+this.getAvgGrade() + ". Person has "+ this.talents.size()+" additional achievements.");
		}
	}
	
	public boolean checkGifted() {
		if(talents.size() >= 3 && this.getAvgGrade() > 6) {
			return true;
		}else {
			return false;
		}
	}
	
	double getAvgGrade() {
		if(this.Grade.size() == 0) {
			return 0;
		}
		
		double total = 0;
		for(Integer grade : this.Grade) {
			total += grade;
		}
		
		return total / this.Grade.size();
	}

	public void checkTalent(String keyword) {
		ArrayList<Student> newList = new ArrayList<Student>();
		for(Student c : classmates) {
			for(String b : c.talents) {
				if(b.contains(keyword)) {
					newList.add(c);
				}
			}
		}
		
		for(Student f : newList) {
			System.out.println(f.name + "has an achievement including the keyword" + keyword);
		}
	}
	
	public ArrayList<Student> getClassmatesByAgeDesc(){
		ArrayList<Student> sorted = new ArrayList<Student>(this.classmates);
		Collections.sort(sorted, (a, b) -> a.age - b.age);
		return sorted;
	}
}
