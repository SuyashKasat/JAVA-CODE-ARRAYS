import java.util.*;
public class Kthminmax{
static int Position(int A[],int lb, int ub){
int pivot =A[lb];
int start=lb;
int end =ub;
while(start<end){
while(A[start]<=pivot){
start++;}
while(A[end]>pivot){
end--;}
if(start<end){
int temp=A[start];
A[start]=A[end];
A[end]=temp;
}
}
int temp=A[lb];
A[lb]=A[end];
A[end]=temp;
return end;
}

static void Sort( int A[],int lb,int ub){
if(lb<ub){
int x=Position( A,lb,ub);
Sort( A,lb,x-1);
Sort(A,x+1,ub);
}
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
Sort(A,0,n-1);
System.out.println("Enter no to find Kthmax and Kthmin");
int k=s.nextInt();
if(k>n){
System.out.println("greater than max size"); }
else{
System.out.println("min is:"+ A[k-1] +    "max is:"+ A[n-k]);
}
}
}

