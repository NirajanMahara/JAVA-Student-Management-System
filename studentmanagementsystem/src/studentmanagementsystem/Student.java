package studentmanagementsystem;

import java.util.Scanner;

public class Student {
	private String studentID;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 500;
	private static int id = 2020;
	
	// Constructor: prompts user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Student First Name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter Student Last Name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student Grade Level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
	}
	
	// Generate an ID
	private void setStudentID() {
//		Grade Level + ID
		id++;
		this.studentID =  gradeYear + "" + id;
		
	}
	
	// Enroll in courses
	public void enroll() {
//		Get inside a loop, users hits 0
		do {
			System.out.print("Enter courses to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n\t" +course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		} while (1 != 0);
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Remaining Balance: $" + tuitionBalance);
	}
	
	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter Payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("$" + payment + " PAID!!! THANKS FOR PAYMENT");
		viewBalance();
	}
	
	// Show status
	public String toString() {
		return "STUDENT ID: " + studentID + "\nName: " + firstName + " " + lastName +"\nGRADE LEVEL: "+ gradeYear + "\nCOURSES ENROLLED: " + courses + "\nREMAINS BALANCE: $" + tuitionBalance; 
	}
	
 
}
