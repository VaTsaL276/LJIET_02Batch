package ArrayOfObject;

import java.util.*;

class student{
	int Enrollment;
	String name;
	
	public void setData(int Enrollment,String name) {
		this.Enrollment = Enrollment;
		this.name = name;
	}
	
	public void show()
	{
		System.out.println("Entrollment : "+Enrollment);
		System.out.println("Name : "+name);
		System.out.println("--------------------");
		
	}
}


public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student[] batch1 = new student[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter Name : ");
			String name = sc.next();
			System.out.println("Enter Entrollment : ");
			int en = sc.nextInt();
			System.out.println("-----------------------");
			batch1[i] = new student();
			batch1[i].setData(en, name);	
		}
		for(int i=0;i<5;i++) {
			
			batch1[i].show();
		}	
	}
}
