//prims algoritthum code
package Main;
import java.util.*;
import java.lang.*;
import java.io.*;
class primsalgorithum{
    private static  int V,sum=0;
    private static int adjmat[][];
    int minkey(int key[], Boolean Set[])
    {
        int min = Integer.MAX_VALUE, minindex = -1;
 
        for (int v = 0; v < V; v++)
            if (Set[v] == false && key[v] < min){
                min = key[v];
                minindex = v;
            }
        return minindex;
    }
    void printmst(int parent[], int adjmat[][])
    {
        for (int i = 1; i < V; i++){
    System.out.println(parent[i] + " - " + i + "\t" + adjmat[i][parent[i]]);
            sum=sum+adjmat[i][parent[i]];
        }
        System.out.println(sum);
    }
 
    void prims(int adjmat[][])
    {
        int parent[] = new int[V];
        int key[] = new int[V];
        Boolean Set[] = new Boolean[V];
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            Set[i] = false;
        }
        key[0] = 0; 
        parent[0] = -1; 
        for (int count = 0; count < V - 1; count++) {
            int u = minkey(key, Set);
            Set[u] = true;
            for (int v = 0; v < V; v++)
        if (adjmat[u][v] != 0 && Set[v] == false && adjmat[u][v] < key[v]){
                    parent[v] = u;
                    key[v] = adjmat[u][v];
                }
        }
        printmst(parent, adjmat);
    }
 
    public static void main(String[] args)
    {
        primsalgorithum t = new primsalgorithum();
        Scanner inp=new Scanner(System.in);
        V=inp.nextInt();
        adjmat=new int[100][100];
        for(int i=0;i<V;i++){
        for(int j=0;j<V;j++){
        adjmat[i][j]=inp.nextInt();
        }
        }
        t.prims(adjmat);
    }
}