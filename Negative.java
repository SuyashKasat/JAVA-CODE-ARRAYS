import java.util.*;
public class Negative{
static void arrange(int A[],int n){
int j=0;int temp;
for(int i=0;i<n;i++){
if(A[i]<0){
if(i!=j){
temp=A[i];
A[i]=A[j];
A[j]=temp;}
j++;}
}
}

public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter array size");
int n=s.nextInt();
int A[]=new int[n];
System.out.print("Enter array elements");
for(int i=0;i<n;i++){
A[i]=s.nextInt();
}
arrange(A,n);
System.out.println("Array is:");
for(int i=0;i<n;i++){
System.out.print(A[i]+" ");
}
}
}
