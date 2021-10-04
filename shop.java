package newton_school;

public class shop {
	public static void main(String[] args) {
		String s = "morning";
		String s1 = "bring";
		String str="";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s1.length(); j++)
			{
				if(s.charAt(i)==s1.charAt(j))
					{
					 str=str+s.charAt(i);
					}
		}

	}
		System.out.print(str);


}
}
