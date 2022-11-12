import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner ob=new Scanner(System.in);
	    int number=ob.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
		    list.add(ob.nextInt());
		}
		for(int i=0;i<a.size();i++){
		    for(int j=i+1;j<a.size();j++){
		        if((list.get(i)^list.get(j))==0){
		            list.remove(j);
		        }
		    }
		}
		System.out.println(list);
	}
}
