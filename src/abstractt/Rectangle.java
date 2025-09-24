package abstractt;

public class Rectangle extends Shape{


	@Override
	void area() {
		int x=5;
		int y=10;
		int area=0;
		
		area= x * y;
		System.out.println("The area of rectangle is " + area);
		
	}

}
