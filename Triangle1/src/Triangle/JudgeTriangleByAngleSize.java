package Triangle;

public class JudgeTriangleByAngleSize implements JudgeTriangle{

	//This method judges the type of triangle from the view of the Angle with each Side Length.

	 String s = "null";
	 Triangle triangle;
	 
	 public String returnTriangle(float x,float y,float z){
		 
		// Each side must have a length value larger than 0.
		  if (x > 0 && y > 0 && z > 0) { 
			//For any triangle, the length value of the adding with any two sides
			// must be larger than the length value of the third side. 
			  if (x + y > z && x + z > y && y + z > x) {                    
				//For a right triangle, the area of the square whose side is the hypotenuse 
				//(the side opposite the right angle) is equal to the sum of the areas of the 
				 //squares whose sides are the two legs (the two sides that meet at a right angle).
				 if (x*x+y*y==z*z || z*z+y*y==x*x || x*x+z*z==y*y) {        
					 RightTriangle triangle = new RightTriangle();          
					 s = triangle.returnTriangleNanme();   
				//For a acute triangle, the adding of the squares by any two sides  
				// must be larger than the value of the square by the third angle.
			     }else if(x*x+y*y>z*z && z*z+y*y>x*x && x*x+z*z>y*y){                                                                        
			    	 AcuteTriangle triangle = new AcuteTriangle();          
			    	 s = triangle.returnTriangleNanme(); 
			    //If the triangle is not right or acute, it is a obtuse triangle. 
			     } else {                                                                                                                                      
			    	 ObtuseTriangle triangle = new ObtuseTriangle();
			    	 s = triangle.returnTriangleNanme();
			     } 
			   } else {
			         s = "non triangle";
			   }
			  } else {
			         s = "non triangle";
			  }
			  return s;
	 }
}
