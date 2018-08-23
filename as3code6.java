import java.util.Scanner;
class as3code6
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
boolean flag=false;
int n=s.nextInt();
for(int i=2;i<n/2;++i)
{
if(n%i==0)
{
flag=true;
break;
}
}
if(!flag)
System.out.println(n +" "+"no. is prime");
else
System.out.println(n +" "+"no. is not prime");
}
}