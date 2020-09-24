package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// ask how many new students we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];	
		
		// create n number for new students
		for (int n = 0; n < numOfStudents; n++) {
			int studentNum = n+1;
			System.out.println("Student #" + studentNum + "/" + numOfStudents);
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		}
	}

} 