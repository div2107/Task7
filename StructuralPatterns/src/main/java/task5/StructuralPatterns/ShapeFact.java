package task5.StructuralPatterns;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ShapeFact {
	private static final Logger LOGGER=LogManager.getLogger(ShapeFact.class);
	private static final HashMap circleMap = new HashMap();

	   public static Shape getCircle(String color) {
	      Circle circle = (Circle)circleMap.get(color);

	      if(circle == null) {
	         circle = new Circle(color);
	         circleMap.put(color, circle);
	         LOGGER.info("Creating circle of color : " + color);
	      }
	      return circle;
	   }

}
