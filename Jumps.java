import java.util.*;
public class Jumps{

static int jumps(int A[],int n){
int count=0;
int i=0;
while(i<n-1){
int y=A[i];
i=i+y;

count ++;
}
return count;
}

public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array");
int n =s.nextInt();
System.out.println("Enter array elements");
int A[]=new int[n];
for(int i=0;i<n;i++){
A[i]=s.nextInt();
}

int x=jumps(A,n);
System.out.println("No of min jumps to reach end is:" + x);
}
}
