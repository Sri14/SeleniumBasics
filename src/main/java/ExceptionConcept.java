
public class ExceptionConcept {

	public static void main(String[] args) throws Exception  {
		
		//exceptions - errors in java
		//Handing  - the behaviour, We want to catch the exceptions and log messages for troubleshooting / debug
		// runtime errors - they don't show an error when writing - but they show only upon execution
	
		try {
			division();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		division();
		
	}
	
	public static  void division()throws Exception {
		
		System.out.println("*******Starting code***********");
		
		int i =1/0;
		
		System.out.println("*************Ending code*************");
		
	}
	

}
