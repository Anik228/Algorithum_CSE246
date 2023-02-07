//Anik Lal Dey//2020-1-60-228
//Implementation of UCS using Dijkstra.
package Main;
import java.util.*; 
import java.lang.*; 
import java.io.*; 
   public class Dijkstra{
       public static int par[];
       public static int newdist;
       public static void dijkstra(int[][] dijkstra){
       int v=dijkstra.length;
       boolean visited[]=new boolean[v];
       int distance[]=new int[v];
       distance[0]=0;
       for(int i=1;i<v;i++){
       distance[i]=Integer.MAX_VALUE;
       }
       for(int i=0;i<v-1;i++){
       int minvertex=findminvertex(distance,visited);
       visited[minvertex]=true;
       for(int j=0;j<v;j++){
       if(dijkstra[minvertex][j]!=0 && 
       !visited[j] && distance[minvertex]!=Integer.MAX_VALUE)
       {
       newdist=distance[minvertex]+dijkstra[minvertex][j];
       if(newdist<distance[j]){
       par[j]=minvertex;
       distance[j]=newdist;
       }
       }
       }
       }
       for(int i=0;i<v;i++){
       System.out.println(i+" "+distance[i]);
       }
       }  
       public static int findminvertex(int[] distance ,boolean[] visited){
       int minvertex=-1;
       for(int i=0;i<distance.length;i++){
       if(!visited[i] &&(minvertex==-1 || distance[i]<distance[minvertex])){
       minvertex=i;
       }
       }
       return minvertex;
       }
   public static void main(String args[]){
   Scanner inp=new Scanner(System.in);
   int v=inp.nextInt();
   int e=inp.nextInt();
   par=new int[v];
   int adjmat[][]=new int[v][v];
   for(int i=0;i<e;i++){
   int v1=inp.nextInt();
   int v2=inp.nextInt();
   int weight=inp.nextInt();
   adjmat[v1][v2]=weight;
   adjmat[v2][v1]=weight;
   }
   for(int i=0;i<v;i++){
   par[i]=-1;
   }
   int src=0;
   int count=0;
   int arr1[]=new int[v];
   System.out.println("Enter the destination node");
   int des=inp.nextInt();
   int des1=des;
   dijkstra(adjmat);
   System.out.println("Here the destination "+des+" to source "+src+" lowest cost path is printing the below");
   System.out.println(des);
   arr1[count]=des;
   count++;
   while(par[des]!=src){
   arr1[count]=par[des];
   count++;
   System.out.println(par[des]);
   des=par[des];
   }
   System.out.println(0);
   System.out.println("Here the source "+src+" to destination "+des1+" lowest cost path is printing the below");
   System.out.println(0);
   for(int i=count-1;i>=0;i--){
   System.out.println(arr1[i]);
   }
   }
   }
/*
9
14
0 1 4
0 7 8
1 2 8
1 7 11
7 8 7
7 6 1
8 6 6
2 8 2
2 3 7
6 5 2
2 5 4
3 5 14
3 4 9
5 4 10
*/

   
  