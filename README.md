# AssignmentTriangle
The design pattern uses the Factory and Command.

The 'interface JudgeTriangle' class is the interface for many classes to implement. Here introduce two classes: JudgeTriangleByAngleSize and JudgeTriangleBySideLength.

The 'abstract class Triangle' is the abstract class for many subclass to inherit. Here introduce 6 subclass: EquilateralTriangle, IsoscelesTriangle, ScaleneTriangle, RightTriangle, AcuteTriangle and ObtuseTriangle. 

The JudgeTriangleByAngleSize class judges the type of triangle from the view of the Angle with each Side Length. Each side of a triangle must have a length value larger than 0. For any triangle, the length value of the adding with any two sides must be larger than the length value of the third side. For a right triangle, the area of the square whose side is the hypotenuse (the side opposite the right angle) is equal to the sum of the areas of the squares whose sides are the two legs (thetwo sides that meet at a right angle). For a acute triangle, the adding of the squares by any two sides must be larger than the value of the square by the third angle.If the triangle is not right or acute, it is a obtuse triangle.

The JudgeTriangleBySideLength class judges the type of triangle from the view of each Side Length. Each side of a triangle must have a length value larger than 0. Forany triangle, the length value of the adding with any two sides must be larger than the length value of the third side. For an equilateral triangle, the length valueof all the three sides must be equal to each other. For an isosceles triangle, the length value of any two sides must be equal to each other. A scalene triangle is atriangle that has three unequal sides. A scalene: no sides are equal and no angles are equal.

Use the JUnit to test unit framework with JUnit test fixture. Test the two judge methods: JudgeTriangleByAngleSize and JudgeTriangleBySideLength. Test the 6 subclass: EquilateralTriangle, IsoscelesTriangle, ScaleneTriangle, RightTriangle, AcuteTriangle and ObtuseTriangle. Test all the situations for non triangle.
Test only one code unit at a time. Don’t make unnecessary assertions. Make each test independent to all the others. Debug the test cases which are actually failingdue to bugs in some external system. Don’t unit-test configuration settings. Name your unit tests clearly and consistently. Write tests for methods that have thefewest dependencies first, and work the way up. All methods, regardless of visibility, have appropriate unit tests. Aim for each unit test method to perform exactlyone assertion. Do not use static members in a test class. Create unit tests that target exceptions. 
 

In the TriangleMain class, use the try and catch for some Exceptions like inputs with some strings or other non-float inputs. It is possible to add the other methodsto judge the type of triangle.

  

