

import java.util.*;
import java.util.Random;

public class Circle{
	public static void main(String args[]){
		
		Random num = new Random();
		
		int p0x = num.nextInt(100);
		int p1x = num.nextInt(100);
		int p0y = num.nextInt(100);
		int p1y = num.nextInt(100);
		int mpx = num.nextInt(100);
		int mpy = num.nextInt(100);
		double radius = num.nextInt(100);
		
		System.out.println("Coordinates of a Random Line Segment");
		System.out.println("1st X coordinate: " + p0x);
		System.out.println("2nd X corrdinate: " + p1x);
		System.out.println("1st Y coordinate: " + p0y);
		System.out.println("2nd Y coordinate: " + p1y);
		System.out.println("Coordinates of a Random Circle");
		System.out.println("Midpoint of X: " + mpx);
		System.out.println("Midpoint of Y: " + mpy);
		System.out.println("Radius: " + radius);
		
		if(lineincircle(p0x, p1x, p0y, p1y, mpx, mpy, radius) == true)
			System.out.println("The line is inside the circle");
		else
			System.out.println("The line is not inside the circle");
		}
	
	int lineseglength(int p0x, int p1x, int p0y, int p1y){
		return sqrt(pow(p0x-p1x, 2.0) + pow(p0y-p1y, 2.0));
	}
	
	private int sqrt(int i){
		return 0;
	}

	private int pow(int i, double d){
		return 0;
	}

	static boolean lineincircle(int p0x, int p1x, int p0y, int p1y, int mpx, int mpy, double radius){
		
		if((p0x < mpx+radius && p0x > mpx-radius) &&
		      (p0y < mpy+radius && p0y > mpy-radius) &&
		        (p1x < mpx+radius && p1x > mpx-radius) &&
		          (p1y < mpy+radius && p1y > mpy-radius)){

		        return true;
		}
		    else
		    return false;
	}
}