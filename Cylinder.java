import java.util.Scanner;

public class Cylinder{
	
    
    static{
          System.loadLibrary("Cylinder");
    }

	private native double calcSurfaceArea(double n1, double n2);
	private native double calcVol(double n1, double n2);
	
	
     public static void main(String[] args) {
		 
         Scanner scanner = new Scanner(System.in);
         System.out.printf("Enter radius(in cm): ");
         double rad = scanner.nextDouble();
		 
		
		 Scanner scanner2 = new Scanner(System.in);
         System.out.printf("Enter height(in cm): ");
         double hgt = scanner2.nextDouble();
		  
		  
		 System.out.println("The surface area is: " + new Cylinder().calcSurfaceArea(rad, hgt)+"cm\u00B2");
         System.out.println("The volume is: "+ new Cylinder().calcVol(rad, hgt)+"cm3");

}

//javac Cylinder.java
//java -h . Cylinder.java
//x86_64-w64-mingw32-gcc -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" -shared -o Cylinder.dll Cylinder.c

}