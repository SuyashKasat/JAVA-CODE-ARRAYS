import java.util.*;
class BadSubarrays{
static void divisors(int A[],int n,int x){
int count=0;
for(int i=1;i<=Math.sqrt(n);i++){
if(n%i==0){
if(n/i==i){
count++;
}
else{
count=count+2;
}
}
}
A[x]=count;
}


static int number(int A[],int B[],int r){
int cnt=0;

for(int i=0;i<r;i++){
for(int j=i;j<r;j++){
int sum=0;
for(int k=i;k<=j;k++){
sum=sum+A[k];
}
System.out.println(sum);
if(sum%2!=0){
cnt++;
}

}
}
return cnt;
}



public static void main(String args[]){
Scanner s=new Scanner(System.in);
int r=s.nextInt();
int B[]=new int[r];
int A[]=new int[r];

for(int i=0;i<r;i++){
B[i]=s.nextInt();
divisors(A,B[i],i);
}


int n=number(A,B,r);
System.out.println(n);
}
}

