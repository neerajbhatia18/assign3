import java.util.Scanner;
class as3code4
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a>b  &&  a>c)
{
System.out.println(a+" "+"is the greatest no.");
}
else if(b>a  && b>c)
{
System.out.println(b+" "+"is the greatest no.");
}
else
{
System.out.println(c+" "+"is the gretest no.");
}
}
}

