package in.learn.java;

public class LanguageFundamentals {
	
	int noOfEmployee;
	static int noOfStudent = 11;

	public static void main(String[] args) {
		
		System.out.println(new LanguageFundamentals().noOfEmployee);
		System.out.println(new LanguageFundamentals().noOfEmployee);
		System.out.println(LanguageFundamentals.noOfStudent);
		Integer sumOfNumberInteger = 125;
		System.out.println(sumOfNumberInteger);

		// Byte Data Type
		
		System.out.println(Byte.SIZE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Boolean.TYPE);
		System.out.println(Character.MIN_VALUE);
		
		// Array
		
		int[] a = new int[12];
		System.out.println(a.length);
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		System.out.println(a.getClass());
		
		Byte[] b = new Byte[10];
		System.out.println(b.length);
		
		
		System.out.println(new int[]{12,12,12,12});
		
		int[] arr = new int[3];
		System.out.println(arr.toString());
		
		char[] nameOfList = new char[3];
		System.out.println(nameOfList.toString());
		
		int[] arrays = new int[23];
		System.out.println(arrays);
		
		int[] x = {2,3,4};
		System.out.println(x.length);
		
		System.out.println(getSum(new int[]{1,2,3,4,4}));
		
		Runnable[] runnables = new Runnable[23];
		System.out.println(runnables.toString());
		System.out.println(runnables.getClass());
		
		String[] nameList = new String[12];
		System.out.println(nameList.length + " " + nameList.getClass());
		
	}
	
	public static int getSum(int[] b) {
		int sum = 0;
		for(int c : b) {
			sum = sum + c;
			System.out.println(c);
		}
		return sum;
	}
}
