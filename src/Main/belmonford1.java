//Anik Lal Dey//2020-1-60-228
//code 2
package Main;
import java.util.*;
public class belmonford1 {
    public static int vertex[],edge[],weight[],v,e;
    
    public static void belmenford()
    {
        int dist[] = new int[v];
        dist[0] = 0;
        for (int i = 1; i < v; ++i)
                dist[i] = Integer.MAX_VALUE;
        for (int i = 1; i < v; ++i) {
            for (int j = 0; j < e; ++j) {
                int u =vertex[j];
                int v =edge[j];
                int we =weight[j];
                if (dist[u] != Integer.MAX_VALUE && dist[u] + we < dist[v])
                    dist[v] = dist[u] + we;
            }
        }
        for(int i=0;i<v;i++){
       System.out.println(i+" "+dist[i]);
       }
    }
   public static void main(String args[]){
   Scanner inp=new Scanner(System.in);
   v=inp.nextInt();
   e=inp.nextInt();
   vertex=new int[1000];
   edge=new int[1000];
   weight=new int[1000];
   int adjmat[][]=new int[v][v];
   for(int i=0;i<e;i++){
   vertex[i]=inp.nextInt();
   edge[i]=inp.nextInt();
   weight[i]=inp.nextInt();
   }  
   belmenford();
   }
}
