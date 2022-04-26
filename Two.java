import java.util.*;
class Two
{
public static void main(String[] a)
{
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int i,j,k,x=n;
int pre=0;
for (i=1; i<=n; i++)   
{     
for (j=n-i; j>=0; j--)   
System.out.print(" ");      
x=n-1;
pre=i;
for (k=0; k<i; k++ )   
{   
if(k<i)
{
System.out.print(pre+" ");
pre=pre+x;
--x;
}

}   
System.out.println();   
}   
}   
}  