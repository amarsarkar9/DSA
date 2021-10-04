package newton_school;

public class rightLeft {
	public static void main(String args[])
	{
		int arr[]= {-7,1,5,2,-4,3,0};
		int ans=equalSum(arr);
		System.out.println(ans);
	}
	private static int equalSum(int a[])
	{
		
		for(int i=1;i<a.length-1;i++)
		{
			int rt=0;
			int lt=0;
			for(int j=0;j<i;j++)
			{
				lt+=a[j];
			}
			for(int j=i+1;j<a.length;j++)
			{
				rt+=a[j];
			}
			if(rt==lt)
			{
				return i;
			}
			System.out.println(lt+" , "+rt);
		}
		return -1;
	}

}
