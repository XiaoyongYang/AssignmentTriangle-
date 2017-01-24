package Triangle;

public class JudgeTriangleBySideLength implements JudgeTriangle{

	//This method judges the type of triangle from the view of each Side Length.

	 String s = "null";
	 Triangle triangle;
	 
	 public String returnTriangle(float x,float y,float z){
		// Each side must have a length value larger than 0.
		  if (x > 0 && y > 0 && z > 0) {  
			//For any triangle, the length value of the adding with any two sides
			// must be larger than the length value of the third side.
			   if (x + y > z && x + z > y && y + z > x) {    
			    if (x == y || x == z || y == z) {    
			    //For an equilateral triangle, the length value of 
			    //all the three sides must be equal to each other. 
			     if (x == y && y == z) {                                                                                        
			        EquilateralTriangle triangle = new EquilateralTriangle();  
			        s = triangle.returnTriangleNanme();
			    //For an isosceles triangle, the length value of 
			    //any two sides must be equal to each other. 
			     } else {                                                                                                                                               
			    	IsoscelesTriangle triangle = new IsoscelesTriangle();   
			    	s = triangle.returnTriangleNanme();
			     }
			   //A scalene triangle is a triangle that has three unequal sides.
			   //A scalene: no sides are equal and no angles are equal
			    } else {                                                                                                                                               
			    	ScaleneTriangle triangle = new ScaleneTriangle();  
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
