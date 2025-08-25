package in.learn.java;

public class OperatorAssignment {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		int a = 12;
		
		System.out.println(a++);
		System.out.println(a);
		
		byte b = 1;
		byte c = (byte) (b + 1);
		System.out.println(c);
		
//		System.out.println(12/0);
		
		System.out.println(-12.0/0);
		
		System.out.println(0.0/0);
		
		System.out.println(12>122);
		
		Thread t = new Thread();
//		System.out.println(t == new String("Rajesh kumar"));
		
		
		Integer x = 12;
		
		System.out.println(x instanceof Object);
		
		System.out.println(t instanceof Object);
		
		System.out.println(t instanceof Thread);
		
		
		System.out.println(true & false);
		
		System.out.println(true|false);
		
		System.out.println(true^false);
		
		System.out.println(~8);
		
		System.out.println(!false);
		
		Boolean p = true;
		Boolean q = false;
		
		System.out.println(p & q);
		System.out.println(p | q);
		
		System.out.println(p && q);
		System.out.println(p || q);
		
//		int a=b=c=d=10;
		
		
		int answer = (10 > 3)?12:12;
		System.out.println(answer);
		
		
		Object o = Class.forName("Tread").newInstance();
		System.out.println(o.getClass().getName());
		
		
	}

}
