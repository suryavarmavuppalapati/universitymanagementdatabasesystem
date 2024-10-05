package university.management.project;
import java.util.*;
public class StudentDatabase {
	public static void main(String args[]) {
		
		//Student s1 = new Student();
		//s1.showInfo();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = in.nextInt();
		Student stu[] = new Student[n];
		for(int i=0;i<n;i++) {
			stu[i] = new Student();
		}
		for(Student s:stu) {
			s.showInfo();
		}
	}
}
