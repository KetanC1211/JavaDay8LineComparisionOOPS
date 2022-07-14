package com.bridgelabz;
import java.util.*;
public class Line_Comparison {
	public static double lineLength(int x1, int x2, int y1, int y2) {
		int z = ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
		double length = Math.sqrt(z);
		return length;
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Co-ordinates (x1,y1) and (x2,y2) of line");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double length = Line_Comparison.lineLength(x1, x2, y1, y2);
		System.out.println("Length of line is "+length);
	}
}
