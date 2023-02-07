package Main;
import java.util.*;
public class insertionsort {
public static  int b[];
public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER OF ARRAY ELEMENT");
    int a=inp.nextInt();
    int b[]=new int[100000];
    for(int i=0;i<a;i++){
       b[i] = (int)(Math.random() * 1001 + 1); 
    }
    System.out.println("Before the sorting");
    System.out.println();
    for(int i=0;i<a;i++){
    System.out.print(" "+b[i]);
    }
    long start1 = System.currentTimeMillis(); 
    for(int i=1;i<a;i++){
    int temp=b[i];
    int j=i-1;
    while(j>=0 && b[j]>temp){
        b[j+1]=b[j];
        j--;
    }
    b[j+1]=temp;
    }
    long end1 = System.currentTimeMillis();
    System.out.println();
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
