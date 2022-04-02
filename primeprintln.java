import java.util.*;

public class primeprintln{
	public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		int t=xcn.nextInt();
		int n=xcn.nextInt();
		for(int i=t;i<=n;i++)
		{
			if(primeNumberChecker(i))
			{
				System.out.println(i);
			}
		}
		xcn.close();
	}
	public static boolean primeNumberChecker(int n){
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0||n==1)
			{
				return false;
			}
		}
		return true;
	}
}