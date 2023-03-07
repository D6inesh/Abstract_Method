/**
1. This Program show a abstract method and it's uses and why we use Abstract Method
   ===================================================================================
2. Abstract Method :
   ===============
       A method that is declared without body, ends with semicolon[;] and contains abstract modifier is called Abstract Method.
	   Example:
	       abstract       void        m1             ()           ;
		 (Modifier) (Return Type) (Method Name) (Parenthesis) (Semicolon)
		                
3. Uses
   ====
   An abstract method is meant for declaring an operation of an object for forcing 
   subtype to implement that operation according this subtype business.
   
In this example, we taken a interface 'Shape' and delcaring a method in to find area.
here, Shape which is not specify to any shape of things
Shape means may be circle, reactangle, triangle etc.
 
Also to find area for different shape like (rectangle, square, circle), whose area calulation is different from one another
That's why we taken abstract method, which will force to subclasses to implement their own logic...

*/
import java.util.Scanner;    // Scanner class get input from User. Scanner is a Pre-defined class
interface Shape{             
	abstract void findArea();//
}
class Circle implements Shape{  // Circle class is inherited from Shape, means Shape is super class and Circle is subclass
	static Scanner sc = new Scanner(System.in);  // Here we taken 'Scanner' as class type variable, because we defined all variables in class level...
	static final double pi = 3.14;
	{
		System.out.print("Enter the Circle Radius: ");
	}
	double radius = sc.nextDouble();
	public void findArea(){
		double area = pi*radius*radius;    //Circle Area Formula
		System.out.println("Area of Circle :  "+area);
		System.out.println();
	}
}
class Square implements Shape{   // Square class is inherited from Shape, means Shape is super class and Square is subclass
	static Scanner sc = new Scanner(System.in);
	{
		System.out.print("Enter the Square side: ");
	}
	double side = sc.nextDouble();
	public void findArea(){
		double area = side*side;       //Square Area Formula
		System.out.println("Area of Square :  "+area);
		System.out.println();
	}
}
class Rectangle implements Shape{ // Rectangle class is inherited from Shape, means Shape is super class and Rectangle is subclass
	static Scanner sc = new Scanner(System.in);
	{System.out.print("Enter the Rectangle Length : ");}
	double length = sc.nextDouble();
	{System.out.print("Enter the Rectangle Breadth : ");}
	double breadth = sc.nextDouble();
	public void findArea(){
		double area = length*breadth;   //Rectangle Area Formula
		System.out.println("Area of Rectangle :  "+area);
		System.out.println();
	}
}
class Test13 {                                /// This class is for test the Program..
	public static void main(String[] args){   // Main method

		Shape s;            // here Shape class taken as super class type and reference varible 's' 
		s = new Circle();  // Here for calling Circle method, circle object create and the reference value stored in 's'.
		s.findArea();

		s = new Rectangle();
		s.findArea();

		s = new Square();
		s.findArea();
	}
}