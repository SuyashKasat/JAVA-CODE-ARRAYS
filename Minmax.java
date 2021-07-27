import java.util.*;
public class Minmax{
static int Max(int A[],int start,int end){
int max=A[start];
for(int i=start+1;i<=end;i++){
if(A[i]>max){
max=A[i];
}
}
return max;
}
static int Min(int A[],int start,int end){
int min=A[start];
for(int i=start+1;i<=end;i++){
if(A[i]<min){
min=A[i];
}
}
return min;
}
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter array size:");
int n=s.nextInt();
int A[]=new int[n];
System.out.println("Enter array elements:");
for(int i=0;i<n;i++){
A[i]=s.nextInt();
}
int max=Max(A,0,n-1);
int min=Min(A,0,n-1);
System.out.print("Max no is:"+max +  "Min no is:"+ min);
}
}

