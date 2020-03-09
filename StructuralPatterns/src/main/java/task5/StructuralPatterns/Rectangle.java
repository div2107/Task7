package task5.StructuralPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Rectangle implements Shape1 {
	private static final Logger LOGGER=LogManager.getLogger(Shape1.class);
	@Override
	   public void draw() {
	      LOGGER.info("Rectangle::draw()");
	   }

}
