package unitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import Triangle.JudgeTriangleBySideLength;

public class JudgeTriangleBySideLengthTest {

	JudgeTriangleBySideLength judgeTriangleBySideLength = new JudgeTriangleBySideLength();;
	  float a;
	  float b;
	  float c;
	
	@Test
	//Test for an Equilateral Triangle
	public void testReturnEquilateralTriangle() {
		a = (float)3.16;
		b = (float)3.16;
		c = (float)3.16;
		String result = judgeTriangleBySideLength.returnTriangle(a, b, c);
		assertEquals("Equilateral Triangle",result);
	}
	
	@Test
	//Test for an Isosceles Triangle
	public void testReturnIsoscelesTriangle() {
		a = (float)3.16;
		b = (float)3.16;
		c = (float)5.16;
		String result = judgeTriangleBySideLength.returnTriangle(a, b, c);
		assertEquals("Isosceles Triangle",result);
	}
	
	@Test
	//Test for a Scalene Triangle
	public void testReturnScaleneTriangle() {
		a = (float)3.16;
		b = (float)6.16;
		c = (float)5.16;
		String result = judgeTriangleBySideLength.returnTriangle(a, b, c);
		assertEquals("Scalene Triangle",result);
	}
	
	@Test
	//Test for not a Triangle when the length value of the adding with 
	//any two sides is smaller than the length value of the third side
	public void testReturnNonTriangle1() {
		a = (float)3.16;
		b = (float)2.16;
		c = (float)6.16;
		String result = judgeTriangleBySideLength.returnTriangle(a, b, c);
		assertEquals("non triangle",result);
	}
	
	@Test
	////More than one side has a length value equal to 0
	public void testReturnNonTriangle2() {
		a = (float)3.16;
		b = (float)2.16;
		c = (float)0;
		String result = judgeTriangleBySideLength.returnTriangle(a, b, c);
		assertEquals("non triangle",result);
	}
	
	@Test
	////More than one side has a length value less than 0
	public void testReturnNonTriangle3() {
		a = (float)3.16;
		b = (float)2.16;
		c = (float)-2.66;
		String result = judgeTriangleBySideLength.returnTriangle(a, b, c);
		assertEquals("non triangle",result);
	}
	
}
