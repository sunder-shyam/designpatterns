package tutorial.designpatterns.factory;

public class ShapeFactory {
	
	public static Shape getShape(String shapeType) {
	Shape s=null;
	if(shapeType.equalsIgnoreCase("circle")) {
		s=new Cirle();
	} else if(shapeType.equalsIgnoreCase("rectangle")) {
		s=new Rectangle();
	} else if (shapeType.equalsIgnoreCase("square")) {
		s=new Square();
	}
	return(s);
	}

}
