package ponterapart1;

/**
 * This class is not part of the functionality, but only for sanity checks
 */
public class Main {
	public static void main(String[] args) {
		Clock c1 = new Clock();
		System.out.println(c1.getState());
		c1.doA();
		System.out.println(c1.getState());
		c1.doA();
		System.out.println(c1.getState());
		c1.doA();
		System.out.println(c1.getState());
		c1.doA();
		System.out.println(c1.getState());
		c1.doA();
		System.out.println(c1.getState());
		c1.doB();
		c1.doC();
		c1.doD();
	}
}