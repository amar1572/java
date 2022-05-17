package narrrow;

public class Narrowing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double d=200.06;
		long l=(long)d;
		int i=(int)l;
		System.out.println("Double data Type value"+d);
		System.out.println("Long data Type value"+l);
		System.out.println("Int data Type value"+i);
	}

}
