package task5.StructuralPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Square implements Shape1{
	private static final Logger LOGGER=LogManager.getLogger(Square.class);
	 @Override
	   public void draw() {
	      LOGGER.info("Square::draw()");
	   }
	

}
