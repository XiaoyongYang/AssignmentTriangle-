package unitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import Triangle.JudgeTriangleByAngleSize;

public class JudgeTriangleByAngleSizeTest {

	JudgeTriangleByAngleSize judgeTriangleByAngleSize = new JudgeTriangleByAngleSize();;
	float a;
	float b;
	float c;
	
	@Test
	//Test for a Right Triangle
	public void testReturnRightTriangle() {
		a = (float)3;
		b = (float)4;
		c = (float)5;
		String result = judgeTriangleByAngleSize.returnTriangle(a, b, c);
		assertEquals("Right Triangle",result);
	}

	@Test
	//Test for a Acute Triangle
	public void testReturnAcuteTriangle() {
		a = (float)3;
		b = (float)4;
		c = (float)4.6;
		String result = judgeTriangleByAngleSize.returnTriangle(a, b, c);
		assertEquals("Acute Triangle",result);
	}
	
	@Test
	//Test for an Obtuse Triangle
	public void testReturnObtuseTriangle() {
		a = (float)3;
		b = (float)4;
		c = (float)5.6;
		String result = judgeTriangleByAngleSize.returnTriangle(a, b, c);
		assertEquals("Obtuse Triangle",result);
	}
	@Test
	//Test for not a Triangle when the length value of the adding with 
	//any two sides is smaller than the length value of the third side
	public void testReturnNonTriangle1() {
		a = (float)3.16;
		b = (float)2.16;
		c = (float)6.16;
		String result = judgeTriangleByAngleSize.returnTriangle(a, b, c);
		assertEquals("non triangle",result);
	}
	
	@Test
	////More than one side has a length value equal to 0
	public void testReturnNonTriangle2() {
		a = (float)3.16;
		b = (float)2.16;
		c = (float)0;
		String result = judgeTriangleByAngleSize.returnTriangle(a, b, c);
		assertEquals("non triangle",result);
	}
	
	@Test
	////More than one side has a length value less than 0
	public void testReturnNonTriangle3() {
		a = (float)3.16;
		b = (float)2.16;
		c = (float)-2.66;
		String result = judgeTriangleByAngleSize.returnTriangle(a, b, c);
		assertEquals("non triangle",result);
	}
}
