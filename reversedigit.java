import java.util.*;

public class reversedigit{
	public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		long t=xcn.nextLong();
		long tempt=t*10+1;
		// long temptrev=0;
		// for(long i=tempt;i!=0;i/=10)
		// {
		// 	temptrev+=i%10;
		// 	temptrev*=10;
		// }
		// temptrev/=10;
		// for(long i=temptrev;i!=1;i/=10)
		// {
		// 	System.out.println(i%10);
		// }
		for(long i=t;i!=0;i/=10)
		{
			System.out.println(i%10);
		}
		xcn.close();
	}
}