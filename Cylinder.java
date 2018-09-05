import java.util.Scanner;
import java.util.InputMismatchException;

public class Cylinder{
	
    
    static{
          System.loadLibrary("Cylinder");
    }

	private native double calcSurfaceArea(double radius, double height);
	private native double calcVol(double radius, double height);
	
	
     public static void main(String[] args) {
		 
		 double rad, hgt;
		 
         Scanner scanner = new Scanner(System.in);
         System.out.print("\nEnter radius of cylinder(in cm): ");
		 
		 do {

			try {
				rad = scanner.nextDouble();
				if ( rad>= 0) break;

			} catch (InputMismatchException e) {
			} finally {
				scanner.nextLine();
			}

			System.out.print("\nInput must be a positive number!\nEnter radius of cylinder(in cm): ");
		} while (true);
		
		
		 Scanner scanner2 = new Scanner(System.in);
         System.out.print("\nEnter height of cylinder(in cm): ");
		 
		 do {

			try {
				hgt = scanner2.nextDouble();
				if ( hgt>= 0) break;

			} catch (InputMismatchException e) {
			} finally {
				scanner2.nextLine();
			}

			System.out.print("\nInput must be a positive number!\nEnter height of cylinder(in cm): ");
		} while (true);
		 
		 scanner.close();
		 scanner2.close();
		  
		  
		 System.out.println("\nThe surface area of cylinder: " + new Cylinder().calcSurfaceArea(rad, hgt)+"cm^2");
         System.out.println("\nThe volume of cylinder: "+ new Cylinder().calcVol(rad, hgt)+"cm^3");

}

//how to run jni(for my pc):
//javac Cylinder.java
//javac -h . Cylinder.java
//x86_64-w64-mingw32-gcc -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" -shared -o Cylinder.dll Cylinder.c

}