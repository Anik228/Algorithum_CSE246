package Main;
import java .util.*;
import java.lang.*;
public class lcsalgorithum{
    public static int count=0;
    public static int coun=0,a;
    static void lcs(String S1, String S2, int m, int n) {
    int[][] LCS = new int[m + 1][n + 1];
    char lcs1[]=new char[1000];
    int lcs[]=new int[10000];
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++){
        if (i == 0 || j == 0){
          LCS[i][j] = 0;
          lcs[count]=0;
          count++;}
        else if (S1.charAt(i - 1) == S2.charAt(j - 1)){
          LCS[i][j] = LCS[i - 1][j - 1] + 1;
          lcs[count]=LCS[i - 1][j - 1] + 1;
          count++;
        }
        else{
         LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
         lcs[count]=LCS[i - 1][j - 1] + 1; 
         count++;
        }
      }
    }
    char s11[]=new char[1000];
    char s12[]=new char[1000];
    for(int i=0;i<m;i++){
    s11[i]=S1.charAt(i);
    }
    for(int i=0;i<n;i++){
    s12[i]=S2.charAt(i);
    }
    System.out.println("THE LONGEST PAIR LENGTH IS");
    System.out.println(lcs[count-1]);
    int b=Math.max(m,n);
    for(int k=0;k<b;k++){
       coun=0;
    for(int i=k;i<m;i++){
       if(i==k)
       a=0;
       for(int j=a;j<n;j++){
       if(S1.charAt(i)==S2.charAt(j)){
          lcs1[coun]=S1.charAt(i);
           coun++;
           a=j+1;
           break;
        }
       }
    }
    if(coun==lcs[count-1])
    {
    System.out.println("THE SHORTEST PAIR IS");
    for(int i=0;i<coun;i++)
    System.out.print(lcs1[i]);
    System.out.println();
    System.exit(0);
    }
    }
  }
  public static void main(String[] args){
    String S1 = "AGGTAB";
    String S2 = "GXTXAYB";
    int m = S1.length();
    int n = S2.length();
    lcs(S1, S2, m, n);
  }
}

