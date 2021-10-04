package newton_school;

import java.util.Scanner;

public class mat {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
	//	String s=sc.nextLine();
	//	String s1=sc.nextLine();
		String s="amar";
		String s1="rama";
		int c=0;
		for(int i=65;i<s.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(s.charAt(i)==s1.charAt(j))
				{
					c++;
					System.out.println();
				}
			}
		}
		if(c==s.length())
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}

}
