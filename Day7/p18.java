package Day7;
//Number Pattern-6
public class p18 {
	//print a triangle
	public static void main(String[] args) {
		for(int i=1;i<6;i++)//outer loop represents rows
		{
			for(int j=1;j<=i;j++)//inner loop represents columns
			{
				System.out.print(j*j+" ");
			}
			System.out.println();//gives new line after 1 row
		}
	}
}