package tutorial.designpatterns.factory;

public class FactoryDemo {
	public static void main(String args[]) {
		
		
		Shape s1=ShapeFactory.getShape("circle");
		Shape s2=ShapeFactory.getShape("rectangle");
		Shape s3=ShapeFactory.getShape("square");
		
		s1.draw();
		s2.draw();
		s3.draw();
	}

}
