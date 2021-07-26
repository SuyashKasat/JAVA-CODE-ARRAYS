import java.util.*;
public class Sort012{
static void sort012(int A[],int n){
int ct0=0;
int ct1=0;
int ct2=0;
for(int i=0;i<n;i++){
switch(A[i]){

case 0:
ct0++;
break;

case 1:
ct1++;
break;

case 2:
ct2++;
break;
}
}

int i=0;
while(ct0>0){
A[i]=0;
i++;
ct0--;
}

while(ct1>0){
A[i]=1;
i++;
ct1--;
}

while(ct2>0){
A[i]=2;
i++;
ct2--;
}

}

public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter size of array");
int n=s.nextInt();
int A []=new int[n];
System.out.println("Enter array elements i.e 0,1,2");
for(int i=0;i<n;i++){
A[i]=s.nextInt();
}
sort012(A,n);
System.out.println("Array after sorting");
for(int i=0;i<n;i++){
System.out.print(A[i]+" ");
}
}
}