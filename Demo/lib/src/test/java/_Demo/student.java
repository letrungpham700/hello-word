package _Demo;

import java.util.Scanner;

public class student {
	public static String[] inputStudent() {
		Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your name: ");
		String name = scanner.nextLine();
		System.out.printf("Enter your age: ");
        Integer age = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Enter your phone: ");
        String phone = scanner.nextLine();
        return new String[]{name, String.valueOf(age), phone};
    }
	

	public static void studentInfo(String args[]) {
        String[] studentData = inputStudent();
        String name = studentData[0];
        String age = studentData[1];
        String phone = studentData[2];
        System.out.println();
        System.out.printf("Hello %s!\n", name);
        System.out.printf("Age: %s\n", age);
        System.out.printf("Phone: %s\n", phone);
    }
	
	private static void dem() {
		int a =1;
		System.out.printf("a = %d\n",a);
        System.out.printf("a++ = %d\n",a++);
        System.out.printf("a = %d\n",a);
        System.out.printf("++a = %d\n", ++a);
	} 
	public static void main(String[] args) {
        dem();
    }
	
}
