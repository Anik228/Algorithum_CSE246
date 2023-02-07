package Main;
import java.util.*;
import java.lang.*;
import java.io.*;
class FloydWarshall
{
    public static int INF =100000, V = 4;
    void floydwarshall(int adjmat[][])
    {
        int dist[][] = new int[V][V];
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                dist[i][j] = adjmat[i][j];
        for (int k = 0; k < V; k++)
        {
            for (int i = 0; i < V; i++)
            {
                for (int j = 0; j < V; j++)
                {
                    
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
        for (int i=0; i<V; ++i)
        {
            for (int j=0; j<V; ++j)
            {
                if (dist[i][j]==INF)
                    System.out.print("INF");
                else
                    System.out.print(dist[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args)
    {
       Scanner inp=new Scanner(System.in);
        
       int adjmat[][] = { {0,   3,INF,5},
                          {INF, 0,INF,INF,},
                          {INF ,-10,0,INF},
                          {INF ,INF,2,0},
                        };
        FloydWarshall a = new FloydWarshall();
        a.floydwarshall(adjmat);
    }
}


