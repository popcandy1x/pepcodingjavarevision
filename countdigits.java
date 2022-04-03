import java.util.*;

public class countdigits{
	public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		int t=xcn.nextInt();
		int l=0;
		for(int i=t;i!=0;i/=10)
		{
			l++;
		}
		System.out.println(l);
	}
}