import java.util.*;
  
  public class fibotilln{
  
  public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		int t=xcn.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<t;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		xcn.close();
	}
  }