package poonam;

import java.util.Scanner;

public class percentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The Student name ");
		String a = sc.next();
		System.out.println("The marks of java  ");
		int b = sc.nextInt();
		System.out.println("The marks of python ");
		int c = sc.nextInt();
		System.out.println("The marks of cpp ");
		int d= sc.nextInt();
		System.out.println("The marks of web ");
		int e = sc.nextInt();
		int v = ((b+c+d+e)*100)/400;
		System.out.println("The percentage of  " +a +" is " +v );
	}
}
