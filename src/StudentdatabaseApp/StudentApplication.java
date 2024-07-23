package StudentdatabaseApp;

import java.util.Scanner;

public class StudentApplication {
	public static void main(String []a) {
	Student st1 = new Student();
	st1.enroll();
	st1.payTuition();
	System.out.println(st1.toString());
	
	
	System.out.println("Enter the Number of Students Enroll:");
	Scanner sc = new Scanner(System.in);
	int numOffstudent = sc.nextInt();
	Student[] students = new Student[numOffstudent];
	
	for(int n=0;n<numOffstudent;n++) {
		students[n] =new Student();
		students[n].enroll();
		students[n].payTuition();
		
	}
	for(int n=0;n<numOffstudent;n++) {
		System.out.println(students[n].toString());
	}
	
}}
