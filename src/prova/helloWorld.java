package prova;
public class HelloWorld {

	/**
	 * This is an attribute
	 */
	private static String s = "Hello World!";
	
	/**
	 * This is inline documentation for a method
	 * @param args this is the first parameter
	 * @return in this case it returns nothing useful
	 */
	public static void main (String[] args){
		logger.log.println(s);
	}
}
