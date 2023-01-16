//wap to find shortest path between a pair of vertices using bellman ford algorithm
import java.util.Scanner;
public class Bellman {
 	private int d[];
 	private int n;
 	public Bellman(int n)
 	{
 		this.n = n;
 		d = new int[n + 1];
 	}
 	public void BellmanFordEvaluation(int source, int w[][])
 	{
 		for (int i = 1; i <= n; i++)
 		{
 			d[i] = 999;
 		}
		d[source] = 0;
 		for (int i = 1; i <= n - 1; i++)
		{
 			for (int u = 1; u <=n; u++)
 			{
 				for (int v = 1; v <=n; v++)
 				{
 					if(w[u][v] != 999)
 					{
 						if (d[v] >d[u] +w[u][v])
      						d[v] =d[u] +w[u][v];
 					}
 }
 			}
 		}
 		for (int u = 1; u <= n;u++)
 		{
 			for (int v = 1; v <=n; v++)
 			{
    				if (w[u][v]!= 999)
 				{
 					if (d[v] >d[u] +w[u][v])
          {
 				       System.out.println("The Graph contains negative egde cycle");
               System.exit(0);
             }
           }
         }
       }
       for (int vertex = 1; vertex <= n;vertex++)
       {
         System.out.println("distance of source " + source +" to "+ vertex + " is " + d[vertex]);
       }
     }
     public static void main(String[] args)
     {
       int n = 0;
       int source;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number of vertices");
       n = scanner.nextInt();
       int w[][] = new int[n +1][n + 1];
       System.out.println("Enter the adjacency matrix");
       for (int u = 1; u <= n;u++)
       {
         for (int v = 1; v <=n; v++)
         {
           w[u][v] =scanner.nextInt();
         }
       }
       System.out.println("Enter the source vertex");
       source = scanner.nextInt();
       Bellman b = new Bellman(n);
       b.BellmanFordEvaluation(source,w);
       scanner.close();
     }
}
