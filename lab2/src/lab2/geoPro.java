package lab2;

import java.util.Scanner;

public class geoPro {
	
	public static void calcArea() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������뾶�� ");
		double r = scanner.nextDouble();
		System.out.printf("Բ�������%.2f\n",Math.PI*r*r);
	}
	
	public static void convertDay() {
		 String[] weekDay = new String[] {
				 "null","����һ", "���ڶ�", "������",
				"������", "������", "������","������"
			};
		 System.out.print("����������(������1-7����)��");
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		System.out.println(weekDay[day]);
	}
	
	public static void testString() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������һ���ַ���");
		String s1 = scanner.next();
		System.out.print("������һ���ַ���");
		String s2 = scanner.next();
		
		if( s1.contains(s2) ) {
			System.out.printf("%s��%s���Ӵ�",s2 , s1);
		} else {
			System.out.printf("%s����%s���Ӵ�",s2 , s1);
		}
	}
	
	public static void oddEven() {
		 System.out.print("������һ������");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			
			if( num % 2 == 0 ) {
				System.out.printf("%d��ż��\n", num);
			} else {
				System.out.printf("%d������\n", num);
			}
	}
	
	public static void main (String[] args) {
//		calcArea();
//		convertDay();
//		oddEven();
		testString();
	}
 }
