import java.util.Scanner;
class as3code3
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n;
n=s.nextInt();
for(int i=0;i<n;i++)
{
for(int j=i;j<n;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}