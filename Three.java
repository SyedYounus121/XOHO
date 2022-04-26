import java.util.*;
class Three  
{
static boolean isSqrt(int n){
int sqrt = (int)Math.sqrt(n);
if((sqrt*sqrt)==n)
{
return true;
}
else
return false;
}   
public static void main(String args[])  
{  
Scanner s = new Scanner(System.in);
System.out.println("Enter the value of N: ");   
 int SIZE=s.nextInt();
if(isSqrt(SIZE)){
  int n = (int)Math.sqrt(SIZE);
    int i, j, N;  
    int[][] board = new int[n][n];  
    int left, top;  
    left = 0;  
    top  = n -1;  
    N    = 1;  
    for(i=1; i<=n; i++, left++, top--)  
    {  
        //fill from left to right  
        for(j=left; j<=top; j++, N++)  
        {  
            board[left][j] = N;  
        }  
        //fill from top to down  
        for(j=left+1; j<=top; j++, N++)  
        {  
            board[j][top] = N;  
        }  
        //fill from right to left  
        for(j=top-1; j>=left; j--, N++)  
        {  
            board[top][j] = N;  
        }  
        //fill from down to top  
        for(j=top-1; j>=left+1; j--, N++)  
        {  
            board[j][left] = N;  
        }  
    }  
    //print the pattern  
    for(i=0; i<n; i++)  
    {  
        for(j=0; j<n; j++)  
        {  
            System.out.printf("%-5d", board[i][j]);  
        }  
    System.out.printf("\n");  
    }
}
else
System.out.println("Invalid Output");  
}  
} 