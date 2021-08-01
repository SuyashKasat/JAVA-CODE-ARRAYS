import java.util.*;
public class Stocks{
static int profit(int A[],int n){
int cost=0;
int maxprofit=0;

if(n<=1){
return 0;
}

int min=A[0];
for(int i=1;i<n;i++){

if(A[i]<min){
min=A[i];
}

cost=A[i]-min;

maxprofit=Math.max(maxprofit,cost);

}


return maxprofit;








}


public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("enter no of days");
int n=s.nextInt();
System.out.println("Enter price for each day:");
int A[]=new int[n];
for(int i=0;i<n;i++){
A[i]=s.nextInt();
}


int max=profit(A,n);
System.out.println("Max profit is:"+max);
}
}