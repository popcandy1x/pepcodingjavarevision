import java.util.Scanner;

public class digitdispl{
	public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		long t=xcn.nextLong();
		long l=0;
		for(long i=t;i!=0;i/=10)
		{
			l++;
		}
		long lminor=(long)Math.pow(10,(l));
		for(long i=t;lminor!=0;i%=lminor)
		{
			lminor/=10;
			if(lminor==0)
			{
				break;
			}
			System.out.println(i/lminor);
		}
		xcn.close();
	}
}