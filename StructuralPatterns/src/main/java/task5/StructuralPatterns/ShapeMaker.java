package task5.StructuralPatterns;

public class ShapeMaker{
	private Shape1 circle;
	   private Shape1 rectangle;
	   private Shape1 square;

	   public ShapeMaker() {
	      circle = new Circle1();
	      rectangle = new Rectangle();
	      square = new Square();
	   }

	   public void drawCircle(){
	      circle.draw();
	   }
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   public void drawSquare(){
	      square.draw();
	   }

}
