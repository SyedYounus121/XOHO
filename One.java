import java.util.*;
class One
{
public static void main(String[] a)
{
int n = Integer.parseInt(a[0]);
int x,i,j;
for(i=1;i<=n;i++)
{
x=i;
System.out.print(x+" ");
for(j=1;j<n;j++)
{
x+=n;
System.out.print(x+" ");
}
System.out.println();
}
}
}