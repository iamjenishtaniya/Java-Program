import java.io.*;

public class cmd
{
	public static void main(String args[])
	{
		String nums[]={"First","Second","Third","Fourth","Fifth",
						"Sixth","Seventh","Eighth","Nineth","Tenth"};
		int length=args.length;
		System.out.println("Number of arguments = "+length);
		for(int i=0;i<length;i++)
		{
			System.out.println(nums[i]+" student is:- "+args[i]);
		}
	}
}
