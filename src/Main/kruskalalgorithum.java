package Main;
import java.util.*;
public class kruskalalgorithum {
static int V = 5;
static int[] parent = new int[V];
static int INF = Integer.MAX_VALUE;
 
static int find(int i)
{
    while (parent[i] != i)
        i = parent[i];
    return i;
}
 
static void union1(int i, int j)
{
    int a = find(i);
    int b = find(j);
    parent[a] = b;
}
 
static void kruskalMST(int cost[][])
{
    int mincost = 0; 
    for (int i = 0; i < V; i++)
        parent[i] = i;
 
    int count = 0;
    for(int k=0; k< V - 1;k++)
    {
        int min = INF, a = -1, b = -1;
        for (int i = 0; i < V; i++)
        {
            for (int j = 0; j < V; j++)
            {
                if (find(i) != find(j) && cost[i][j] < min)
                {
                    min = cost[i][j];
                    a = i;
                    b = j;
                }
            }
        }
 
        union1(a, b);
        System.out.printf("Edge %d:(%d, %d) cost:%d \n",
            count++, a, b, min);
        mincost += min;
    }
    System.out.printf("\n Minimum cost= %d \n", mincost);
}

public static void main(String[] args)
{

    int v,e;
    int cost[][]=new int[100][100];
   Scanner inp=new Scanner(System.in);
   v=inp.nextInt();
   e=inp.nextInt();
   for(int i=0;i<e;i++) {
      for(int j=0;j<v;j++){
       cost[i][j]=inp.nextInt();
      }
    }
    kruskalMST(cost);
    }
}    