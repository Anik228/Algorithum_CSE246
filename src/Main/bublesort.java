package Main;
import java.util.*;
public class bublesort {
    public static  int b[];
    public static int count;
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
    for(int i=1;i<a-1;i++){
        count=0;
        for(int j=0;j<a-1-i;j++){
        if(b[j]>b[j+1]){
        int temp=b[j];
        b[j]=b[j+1];
        b[j+1]=temp;
        count=1;
        }
        }
        if(count==0)
            break;
    }
    long end1 = System.currentTimeMillis();
    System.out.println("After the sorting");
    for(int i=0;i<a;i++){
    System.out.print(" "+b[i]);
    }
    System.out.println();
    float sec = (end1 - start1) / 1000F;
    System.out.println(" "+sec+"sec");
}
}
