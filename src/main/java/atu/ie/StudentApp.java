package atu.ie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("How many students do you want to enter?: ");
        int count = sc.nextInt();
        sc.nextLine();

        int i = 0;
        while (i < count){
            System.out.println("\nEntering details for student " + (i + 1) + ":");
            Student s = new Student();

            System.out.print("Enter name: ");
            s.setName(sc.nextLine());

            System.out.print("Enter email: ");
            s.setEmail(sc.nextLine());

            System.out.print("Enter course: ");
            s.setCourse(sc.nextLine());

            students.add(s);
            i++;
        }
        System.out.println("\nStudent info:");
        for (Student s : students) {
            s.printInfo();
    }
        sc.close();
    }

}
