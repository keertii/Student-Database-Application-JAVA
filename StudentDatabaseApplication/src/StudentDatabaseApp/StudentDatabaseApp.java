package StudentDatabaseApp;

import java.util.*;
public class StudentDatabaseApp {

	public static void main(String[] args) {
		
//		Student student1=new Student();
//		student1.enroll();
//		student1.payTuition();
//		System.out.println(student1.toString());
		
		//Ask how many user we want to add
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Students you want to enroll: ");
		int n=sc.nextInt();
		Student[] students=new Student[n];
		for(int i=0;i<n;i++) {
			System.out.println("\nGive the Information of the Student: ");
			students[i]=new Student();
			students[i].enroll();
			students[i].payTuition();
		}
		for(int i=0;i<n;i++) {
			System.out.println(students[i].toString());
		}
		
		
		//create a number of new Students
	}

}