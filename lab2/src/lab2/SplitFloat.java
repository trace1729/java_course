package lab2;

import java.util.Scanner;

public class SplitFloat {
    public static void main( String[] args ) {
    	
    	System.out.println("������һ��������");
    	Scanner scanner = new Scanner(System.in);
    	String input = scanner.next();
    	
    	for( char t : input.toCharArray() ) {
   		if( Character.isAlphabetic(t) ) {
    			System.out.println("���븡������ʽ����");
    			return;
    		}
   	  }
    	input.toString();
   	    double num = Double.parseDouble(input);
   	    if( num != 0 ) {
    		int inte = (int)num;
  		    double digits = num - inte;
  		    System.out.print("3.14����������Ϊ��");
    		System.out.println(inte);
    		System.out.print("3.14��С������Ϊ��");
    		System.out.printf("%.2f",digits);
 
    	} 
    } 
}
