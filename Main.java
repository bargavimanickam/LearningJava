import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner bar=new Scanner(System.in);
		int n= bar.nextInt();
		int f1=0,f2=1,f3=1;
    System.out.println("Fibonacci series upto "+n+" is:");
		System.out.print(f1+" "+f2);
		while(f3<n)
		{ 
		    System.out.print(" "+f3);
		    f1=f2;f2=f3;
		    f3=f1+f2;
		}
		
	}
}