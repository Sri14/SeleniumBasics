package logTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logs {

	
	static Logger logger = LogManager.getLogger(Logs.class);
	
	public static void main(String[] args) {
		
		System.out.println("*******this is from syso ***********");
		logger.info("This is an info message");
		logger.error("This is an error message");

	}

}
