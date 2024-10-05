package university.management.project;
import java.util.*;
public class Student {
	private String firstname;
	private String lastname;
	private String gradeyear;
	private String studentId;
	private String courses = "";
	private int tutionBalance=0;
	private int costOfCourse=3000;
	private static int generalId = 1000;
	
	//constructor
	public Student(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first name:");
		this.firstname = in.nextLine();
		
		System.out.print("Enter lastname:");
		this.lastname = in.nextLine();
		
		do {
			System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter class level:");
			String year = in.nextLine();
			if(year.equals("1")||year.equals("2")||year.equals("3")||year.equals("4")) {
				this.gradeyear = year;
				break;
			}
			else {
				System.out.println("Invalid year. Please give correct input");
			}
		}while(1!=0);
		
		setStudentId();
		
		enroll();
		
		feePayment();
		
		}
	
	//netId
	private void setStudentId() {
		generalId++;
		this.studentId = gradeyear+""+generalId;
	}
	
	//enroll courses
	private void enroll() {
		do {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter course to enroll (Q to quit): ");
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses=courses+" "+course;
				tutionBalance+=costOfCourse;
			}
			else {
				break;
			}	
		}while(1!=0);
	}
	
	//fee payment
	private void feePayment() {
		Scanner in = new Scanner(System.in);
		System.out.println("Tution fee: "+tutionBalance);
		System.out.print("Enter the amount paid: ");
		int paid = in.nextInt();
		this.tutionBalance-=paid;
		System.out.println("Balance to be paid: "+tutionBalance);
	}
	
	public void showInfo() {
		System.out.println("\n\nName of the Student: "+firstname+" "+lastname+
				"\nYear of studying: "+gradeyear+"\nStudent Id: "+studentId+
				"\nCourses enrolled: "+courses+
				"\nTution fee to be paid: "+tutionBalance);
	}
}
