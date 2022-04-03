import java.util.*;

public class strings{
	public static void main(String[] args){
		// Scanner xcn=new Scanner(System.in);
		// String s1=xcn.nextLine ();
		// String s2=xcn.nextLine();
		// String s1="hello";
		// System.out.println(s1);
		// System.out.println(s2);
		// String s=xcn.nextLine();
		// System.out.println(s.length());
		// for(int i=0;i<s.length();i++)
		// {
		// 	System.out.println(s.charAt(i));
		// }
		// String s="abcd";
		// System.out.println(s.substring(1,1));
		// for(int i=0;i<s.length();i++)
		// {
		// 	for(int j=i+1;j<=s.length();j++)
		// 	{
		// 		System.out.println(s.substring(i,j));
		// 	}
		// }
		// System.out.println(s.substring(1));
		// String s1="Hello";
		// s1+=' ';
		// s1+='W';
		// s1+='o';
		// s1+='r';
		// s1+='l';
		// s1+='d';
		// s1+=10;
		// String s2="World";
		// String s3=s1+" "+s2;
		// System.out.println(10+20+s1);
		// System.out.println(s1+10+20);
		String s="abc,def,ghi,jkl mno";
		String[] parts=s.split(",");
		for(int i=0;i<parts.length;i++)
		{
			System.out.println(parts[i]);
		}
		// xcn.close();
	}
}