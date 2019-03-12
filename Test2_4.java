
public class Test2_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a[];
		a=new boolean[101];
		int i,j;
		for(i=2;i<=100;i++)
		{
			a[i]=true;
		}
		for(i=2;i<=100;i++)
		{
			if(a[i])
			{
				for(j=2*i;j<=100;j+=i)
				{
					a[j]=false;
				}
			}
		}
		for(i=2;i<=100;i++)
		{
			if(a[i])
			{
				System.out.println(i);
			}
		}
				
	}

}

