import java.util.Arrays;
import java.util.Scanner;
public class LUNCHBOX {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int n;
		int[][] M_E;
		int eat;
		int time;
				
		for(int i = 0; i < t; i++)
		{
			n = sc.nextInt();
			
			M_E = new int[n][2];
			
			eat = 0;
			
			time = 0;
			
			for(int j = 0; j < n; j++)
			{
				M_E[j][0] = sc.nextInt();
			}
			for(int j = 0; j < n; j++)
			{
				M_E[j][1] = sc.nextInt();
			}
			
			Arrays.sort(M_E, (o1, o2) -> {
				if( o1[1] == o2[1] )
				{
					return Integer.compare(o1[0], o2[0]) * -1;
				}
				else
				{
					return Integer.compare(o1[1], o2[1]);
				}
			});
			
			for(int j = n - 1; j >= 0; j--)
			{
				time += M_E[j][0];
				
				eat -= M_E[j][0];
				
				if(eat < M_E[j][1]) eat = M_E[j][1];
			}
			
			time += eat;
			
			System.out.println(time);
		}
	}

}
