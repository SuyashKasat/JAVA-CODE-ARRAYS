import java.util.*;
class Subarray0{

static void subarray( int A[],int n){



for(int i=0;i<n;i++){

for(int j=i;j<n;j++){
for(int k=j;k<=j;k++){
System.out.print(A[k]+" ");
System.out.println(" ");
}
}
}








}

public static void main(String [] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int A[]=new int[n];

for(int i=0;i<n;i++){
A[i]=s.nextInt();
}

subarray(A,n);

}
}