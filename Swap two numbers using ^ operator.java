public class Main
{
	public static void main(String[] args) {
		int a=10,b=5;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After shifting the value of a and b");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}