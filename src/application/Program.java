package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		System.out.print("How many students in calss A?");

		int n = sc.nextInt();

		Set<Student> set = new HashSet<>();

		for (int i = 0; i < n; i++) {

			int student = sc.nextInt();

			Student s = new Student(student);

			set.add(s);

		}

		System.out.print("How many students in calss B?");

		int nB = sc.nextInt();

		for (int i = 0; i < nB; i++) {

			int student = sc.nextInt();

			Student s = new Student(student);

			set.add(s);

		}

		System.out.print("How many students in calss C?");

		int nC= sc.nextInt();

		for (int i = 0; i < nC; i++) {

			int student = sc.nextInt();

			Student s = new Student(student);

			set.add(s);
		}

		
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}

}
