import java.util.*;
public class Rotate{
static void cycle(int A[],int n){
int x=A[n-1];
for(int i=n-2;i>=0;i--){
A[i+1]=A[i];
}
A[0]=x;
}
static void print(int A[],int n){
for (int i=0;i<n;i++){
System.out.print(A[i]+" ");
}
}

public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("enter array size:");
int n=s.nextInt();
System.out.println("Enter array elements");
int A[]=new int[n];
for(int i=0;i<n;i++){
A[i]=s.nextInt();
}
print(A,n);
cycle(A,n);
System.out.println(" ");
print(A,n);
}
}
