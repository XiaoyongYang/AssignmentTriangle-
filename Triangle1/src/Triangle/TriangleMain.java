package Triangle;
import java.util.Scanner;

public class TriangleMain {

	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  float a = 0;
		  float b = 0;
		  float c = 0;
		  try{
		  //Input the values for three sides of the triangle.		  
		  System.out.println("Please input the value for the length of the triangle's fisrt side:");  
		  a = sc.nextFloat();
		  System.out.println("Please input the value for the length of the triangle's second side:");
		  b = sc.nextFloat();
		  System.out.println("Please input the value for the length of the triangle's third side:");
		  c = sc.nextFloat();
		  //catch the Exception for the inputs
		  }catch (Exception e){
			  e.printStackTrace();
		  }
		  
		  //This method judges the type of triangle from the view of each Side Length.
		  JudgeTriangleBySideLength judgeTriangleBySideLength = new JudgeTriangleBySideLength();
		  System.out.println("From the view of Side Length, the triangle with the above sides is a/an " + judgeTriangleBySideLength.returnTriangle(a, b, c));
		  
		  //This method judges the type of triangle from the view of each Angle Size.
		  JudgeTriangleByAngleSize judgeTriangleByAngleSize= new JudgeTriangleByAngleSize();
		  System.out.println("From the view of Angle Size, the triangle with the above sides is a/an " + judgeTriangleByAngleSize.returnTriangle(a, b, c));
		  
		  //Can add the other method to judge the type of triangle.
		 }
	
}
