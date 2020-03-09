package task5.StructuralPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import task5.CustomList1.Main;

public class Circle implements Shape {
	private static final Logger LOGGER=LogManager.getLogger(Circle.class);
	 private String color;
	   private int x;
	   private int y;
	   private int radius;

	   public Circle(String color){
	      this.color = color;		
	   }

	   public void setX(int x) {
	      this.x = x;
	   }

	   public void setY(int y) {
	      this.y = y;
	   }

	   public void setRadius(int radius) {
	      this.radius = radius;
	   }

	   @Override
	   public void draw() {
	      LOGGER.info("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
	   }
	

}
