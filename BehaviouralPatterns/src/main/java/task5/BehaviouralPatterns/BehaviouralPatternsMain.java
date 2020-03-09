package task5.BehaviouralPatterns;
import java.lang.Class;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BehaviouralPatternsMain {
	private static final Logger LOGGER=LogManager.getLogger(BehaviouralPatternsMain.class);
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {  
        LOGGER.info("This is template pattern");
        //Class c=Class.forName(args[0]);  
        //Game game=(Game) c.newInstance();  
        Chess c=new Chess();
        c.initialize();
        c.start();
        c.end();
        Soccer s=new Soccer();
        s.initialize();
        s.start();
        s.end();
        
        
        LOGGER.info("End of template pattern");
        LOGGER.info("This is Memento pattern");
         Article article = new Article(1, "My Article");
         //article.setContent("ABC");      //original content
          LOGGER.info(article);
             
            ArticleMemento memento = article.createMemento();   //created immutable memento
            Article article1 = new Article(1, "My Article");
            //article.setContent("123");      //changed content
            LOGGER.info(article1);
             
            //article.restore(memento);       //UNDO change
            //System.out.println(article);    //original content
        }
      }  
