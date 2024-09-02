package decimal.java;

import java.util.Scanner;
import java.lang.Math;

public class random {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int jackpot=1+(int)(100*Math.random()),guess,counter=1;
		System.out.println("guess the number:");
		guess=sc.nextInt();
		while(guess!=jackpot) {
			if(guess<jackpot) {
				System.out.println("still incorrect you apply higher no");
				System.out.println("guess the higher number than above"+" "+counter+" "+"no");
				
			}
			//else if(guess<jackpot){
				//System.out.println("guess the number higher than above"+" "+counter+" "+"no");
				
			//}
			
			
			else {
				System.out.println("still incorrect you apply higher no");
				System.out.println("guess the lower no than above no"+" "+counter+" "+"no");
			}
			
			System.out.println("guess the number:");
			guess=sc.nextInt();
			counter +=1;
		}
		
		System.out.println("guess correct");
		System.out.println("you took"+" "+counter +" "+"attempt");

}
}
