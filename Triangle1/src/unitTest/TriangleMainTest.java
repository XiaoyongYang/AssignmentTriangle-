package unitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import Triangle.JudgeTriangleByAngleSize;
import Triangle.JudgeTriangleBySideLength;

public class TriangleMainTest {

	@Test
	//Test the initialization of Object JudgeTriangleBySideLength
	public void JudgeTriangleBySideLengthInitialize() {
        System.out.println("The initialization of Object JudgeTriangleBySideLength is starting.");
        JudgeTriangleBySideLength judgeTriangleBySideLength = new JudgeTriangleBySideLength();
        System.out.println("Object JudgeTriangleBySideLength is initialized");
	}
	
	@Test
	//Test the initialization of Object JudgeTriangleByAngleSize
	public void judgeTriangleByAngleSizeInitialize() {
        System.out.println("The initialization of Object JudgeTriangleByAngleSize is starting.");
        JudgeTriangleByAngleSize judgeTriangleByAngleSize = new JudgeTriangleByAngleSize();
        System.out.println("Object JudgeTriangleByAngleSize is initialized");
	}
}
