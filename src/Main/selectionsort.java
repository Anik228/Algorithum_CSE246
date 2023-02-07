package Main;
import java.util.*;
public class selectionsort {
public static  int b[];
public static int mi,t;
public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER OF ARRAY ELEMENT");
    int a=inp.nextInt();
    int b[]=new int[100000];
    for(int i=0;i<a;i++){
       b[i] = (int)(Math.random() * 1001 + 1); 
    }
    System.out.println("Before the sorting");
    for(int i=0;i<a;i++){
    System.out.print(" "+b[i]);
    }  
    System.out.println();
    int k=0;
    long start1 = System.currentTimeMillis(); 
    while(k!=a-1){
    int min=b[k];
    for(int i=k;i<a;i++){
          if(b[i] <= min) 
          {
          min =b[i]; 
          mi=i;
          }
    }
   t = b[mi];
   b[mi] =b[k];
   b[k] =t;
   k++;
   }
   long end1 = System.currentTimeMillis();
    System.out.println("After the sorting");
    System.out.println();
    for(int i=0;i<a;i++){
        System.out.print(" "+b[i]);
    }
    System.out.println();
    float sec = (end1 - start1) / 1000F;
    System.out.println(" "+sec+"sec");
    }
    }
   