package newton_school;

public class rev {
	public static void main(String[] args) {
		int a=123;
		int s=0;
		while(a>0)
		{
			int b=a%10;
			 s=s*10+b;
			a=a/10;
		}
		System.out.println(s);
	}

}
