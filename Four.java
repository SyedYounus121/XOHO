import java.util.*;
class Four
{
public static void main(String[]as)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter the Number of elements in first row "); 
int n= s.nextInt();
int r,sum=0;
int [][]a = new int [n][n];
System.out.print("Enter the row elements ");
for(int i = 0;i<n;i++)
{
int x=0;
a[x++][i] =s.nextInt();
}

for(int i=1; i<n;i++)
{
for(int j=i;j<n;j++)
{
int x = a[i-1][j-1]+a[i-1][j];
if(x>=10){
while(x>0){
 r= x % 10;
 sum = sum  + r;
      x = x / 10;
    }
x=sum;
}
a[i][j]= x;
sum=0;
}
}
for(int i =0; i<n;i++)
{
for(int j=0;j<n;j++)
{
if(a[i][j]!=0)
System.out.print(" "+a[i][j]);
else
System.out.print("   ");
}
System.out.println();
}
}
} 