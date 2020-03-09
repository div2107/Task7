package task5.StructuralPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class StructuralPatternMain {
	private static final Logger LOGGER=LogManager.getLogger(StructuralPatternMain.class);
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
	public static void main(String args[])
	{
		LOGGER.info("This is flyweightpattern in java");
		for(int i=0; i < 20; ++i) {
	         Circle circle = (Circle)ShapeFact.getCircle(getRandomColor());
	         circle.setX(getRandomX());
	         circle.setY(getRandomY());
	         circle.setRadius(100);
	         circle.draw();
	      }
		LOGGER.info("End of flyweightpattern");
		LOGGER.info("This is facade pattern");
		ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();	
	}
	   
	   private static String getRandomColor() {
	      return colors[(int)(Math.random()*colors.length)];
	   }
	   private static int getRandomX() {
	      return (int)(Math.random()*100 );
	   }
	   private static int getRandomY() {
	      return (int)(Math.random()*100);
	   }
	   
	}
