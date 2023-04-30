package chandriki2;
import java.util.Scanner;
public class tableofnumbers {
	static void table(int n)
	{
		int res;
		for(int i=1;i<=10;i++)
		{
			res=i*n;
			System.out.println(res);
		}
	}
	public static void main(String args[])
	{
		System.out.println("enter the no. for its table");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		table(x);
	}

}
