package task5.BehaviouralPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Chess extends Game{
	private static final Logger LOGGER=LogManager.getLogger(Chess.class);
	public void initialize() {  
        LOGGER.info("Chess Game Initialized! Start playing.");  
     }  
    public void start() {  
        LOGGER.info("Game Started. Welcome to in the chess game!");  
     }   
     public void end() {  
        LOGGER.info("Game Finished!");  
     }  

}
