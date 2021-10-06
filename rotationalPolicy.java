package newton_school;

public class rotationalPolicy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RotationPolicy(3,8));
	}
	static int RotationPolicy(int A, int B){
		int count=0;
		for(int i=A;i<=B;i++)
		{
			if(i%6==0)
				count++;
			if(i%2==0)
			{
				if((i-2)%6==0)
					count++;
			}
		}
		return count;
				
		
		}

}
