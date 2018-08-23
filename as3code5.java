import java.util.Scanner;
class as3code5
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int rem;
int rev=0;
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n/=10;
}
if(n==rev)
System.out.println(n+" "+"no. is palindrome");
else
System.out.println(n+" "+"no. is not palindrome");
}
}