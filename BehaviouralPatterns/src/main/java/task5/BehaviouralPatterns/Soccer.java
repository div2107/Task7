package task5.BehaviouralPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Soccer extends Game {
	private static final Logger LOGGER=LogManager.getLogger(Soccer.class);
    void initialize() {  
       LOGGER.info("Soccer Game Initialized! Start playing.");  
    }  
    void start() {  
       LOGGER.info("Game Started. Welcome to in the Soccer game!");  
    }   
    void end() {  
       LOGGER.info("Game Finished!");  
    }  

}
