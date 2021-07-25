import java.util.*;
import java.lang.Math.*;
class Insects{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int printCount=s.nextInt();
int points[][]=new int[printCount][2];
for(int i=0;i<printCount;i++){
points[i][0]=s.nextInt();
points[i][1]=s.nextInt();
}
int queryCount=s.nextInt();
for(int i=0;i<queryCount;i++){
int radius=s.nextInt();
int count=0;

for(int j=0;j<printCount;j++){
double dis=Math.sqrt((points[j][0]-0)*(points[j][0]-0) + (points[j][1]-0)*(points[j][1]-0));
if(dis<=radius){
count++;
}
}
System.out.println(count);
}
}
}



