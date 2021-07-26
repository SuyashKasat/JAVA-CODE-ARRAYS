import java.util.*;
class Common{
static void Array(int A[],int B[],int C[]){
HashMap<Integer,Integer> Hash=new HashMap<Integer,Integer>();
for(int i=0;i<A.length;i++){
Hash.put(A[i],1);
}
for(int i=0;i<B.length;i++){
if(Hash.containsKey(B[i])){
Hash.put(B[i],Hash.get(B[i])+1);
}
}

for(int i=0;i<C.length;i++){
if(Hash.containsKey(C[i])){
Hash.put(C[i],Hash.get(C[i])+1);
}
}

for(Integer i :Hash.keySet()){
if(Hash.get(i)==3){
System.out.println(i);
}
}
}

public static void main(String [] args){
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();

int A[]=new int[x];
int B[]=new int[y];
int C[]=new int[z];

for(int i=0;i<x;i++){
A[i]=s.nextInt();
}
for(int i=0;i<y;i++){
B[i]=s.nextInt();
}
for(int i=0;i<z;i++){
C[i]=s.nextInt();
}

Array(A,B,C);
}
}
