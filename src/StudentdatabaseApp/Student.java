package StudentdatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance=2000;
	private static int costoffcourse =600;
	private static int id = 1000;

	
	// constructor :prompt the student Name
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firstname");
		this.firstName = sc.nextLine();
		System.out.println("Enter the lastname");
		this.lastName = sc.nextLine();
		System.out.println("1for fresher\n2 for sopmore \n3 for Junior \n Enter the student class level");
		this.gradeYear = sc.nextLine();
		setStudentID();
		System.out.println(firstName +""+lastName +""+gradeYear +""+studentID);
		
		}
	
	// Generate an ID
	public void setStudentID() {
		id++;
		this.studentID =gradeYear +" "+ id;
		
		
	}
	
	
	// Enroll in courses
	
	public void enroll() {
		do {
			System.out.println("Enter the course(Q to Quit):");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if(!course.equals("Q")) {
				courses = courses +"\n"+course;
				tuitionBalance = tuitionBalance +costoffcourse;
			}
			else {
				System.out.println("BREAK!");
				break;
			}
		}
		while(1 != 0);
		
		
	}
	
	//view Balance
	public void viewBalance() {
		System.out.println("Your Balance is: $"+tuitionBalance);
	}
	//pay tuition
	public void payTuition()  {
		System.out.println("Enter your payment: $");
	Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance= tuitionBalance - payment;
		System.out.println("Thankyou for Payment $"+payment);
		viewBalance();
		
	}
	// show status
	public String toString() {
		return "Name:" +firstName +""+ lastName+""+"\nGrade level:"+studentID+"\nCourses Enrolled:"+courses+""+"\nBalance:"+tuitionBalance;
		
	}
	

}
