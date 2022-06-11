package StudentDatabaseApp;

import java.util.*;
public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tuitionBalance=0;
	private static int costOfCourse=100;
	private static int id=1000;
	//using static means something that stays with the class not a particular instance of the class 
	
	//Constructor for name and year
	public Student() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first Name of Student: ");
		this.firstName=sc.nextLine();
		
		System.out.print("Enter the last Name of Student: ");
		this.lastName=sc.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter the student's class Level: ");
		this.gradeYear=sc.nextInt();
		
		setStudentID();
//		System.out.println(firstName+" "+lastName+" is in grade Level "+gradeYear+"\nStudent unique ID : "+studentID);
		
	}
	
	//generate an ID
	private void setStudentID() {
		//here student id will be grade level + (class)ID
		id++;
		this.studentID= gradeYear+""+id;
	}
	
	//enroll in courses
	public void enroll() {
		//get inside a loop , user hits 0
		System.out.println();
		do {
			System.out.print("Enter course to enroll(Q to quit): ");
			Scanner sc=new Scanner(System.in);
			String course=sc.nextLine();
			if(!course.equals("Q")) {
				courses=courses+"\n  -"+course;
				tuitionBalance=tuitionBalance+costOfCourse;
			}
			else {
				break;
			}
		}while(1!=0);
//		System.out.println("\nCourses you are Enrolled in: ");
//		System.out.println(courses);
//		System.out.println("Tuition Balance: Rs."+tuitionBalance+"\n");
	}
	
	//View Balance 
	public void viewBalance() {
		System.out.println("Your Balance is: Rs."+tuitionBalance);
	}
	
	//Pay tuition
	public void payTuition(){
		viewBalance();
		Scanner sc=new Scanner(System.in);
		System.out.print("Amount you want to pay(Press 0 if not): ");
		int payment=sc.nextInt();
		if(payment==0) {
			System.out.println("Thankyou your Amount Balance is: Rs."+tuitionBalance);
			return;
		}
		if(payment<=tuitionBalance) {
			tuitionBalance=tuitionBalance-payment;
			System.out.println("ThankYou for your payment of: Rs."+payment);
		}
		else {
			System.out.println("Your remaining Balance is Rs."+tuitionBalance+" only");
		}
	}
	
	//Show status
	public String toString() {
		return "Name: "+firstName+" "+lastName+"\n"+
	"Grade Year: "+gradeYear+"\n"+
				"Student unique ID: "+studentID+"\n"+
	"Courses Enrolled: "+courses+"\n"+
				"Balance: "+tuitionBalance;
	}
}