import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner ob=new Scanner(System.in);
	    int n=ob.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
		    a.add(ob.nextInt());
		}
		for(int i=0;i<a.size();i++){
		    for(int j=i+1;j<a.size();j++){
		        if((a.get(i)^a.get(j))==0){
		            a.remove(j);
		        }
		    }
		}
		System.out.println(a);
	}
}