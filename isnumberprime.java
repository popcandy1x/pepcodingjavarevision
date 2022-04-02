import java.util.*;

public class isnumberprime{
	public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		int t=xcn.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xcn.nextInt();
			if(primeNumberChecker(n))
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("not prime");
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