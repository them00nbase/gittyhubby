package fileDirectory;

public class Test {
	static int x = 10;
	static int y = 20;
	public static void main(String[] args) {
		int j = 59;
		String[] myArray = {"booty1", "booty2", "booty3", "Booty4"};
		System.out.println(j);
		System.out.println(sum(j,x));
		print();
		for(int i=0; i<4;i++) {
			System.out.println(myArray[i]);
		}
		System.out.println("xyz");
		System.out.println("insta");
		System.out.println("hoe");
		
	}

		public static void print() {
			System.out.println("Some Print");
		}
		public static int sum(int a, int b) {
			System.out.println("now we are in the sum method");
			return a+b;
		}
}
