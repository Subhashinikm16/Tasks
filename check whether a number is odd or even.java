public class Main {
	public static void main(String args[]){
	  int a=5;
      System.out.println("using & operator: "+(((a&1)==0)?"Even":"Odd"));
      System.out.println("using | operator: "+(((a|1)==a)?"Odd":"Even"));
      System.out.println("using ^ operator: "+(((a^1)==a+1)?"Even":"Odd"));
}
}