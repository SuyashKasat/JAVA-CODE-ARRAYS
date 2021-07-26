import java.util.*;
public class Merge{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter size for array 1 and array 2 respectively");
int x=s.nextInt();
int y=s.nextInt();

int A[]=new int[x];
int B[]=new int[y];

System.out.println("Enter array elements in ascending order");
for(int i=0;i<x;i++){
A[i]=s.nextInt();
}

for(int i=0;i<y;i++){
B[i]=s.nextInt();
}


System.out.println("merged array is");
for(int i=0;i<x;i++){
for(int j=0;j<y;j++){
if(A[i]>B[j]){
int temp=A[i];
A[i]=B[j];
B[j]=temp;
}
}
}
Arrays.sort(B);
for(int i=0;i<x;i++){
System.out.print(A[i]);
}
for(int i=0;i<y;i++){
System.out.print(B[i]);
}
}
}