import java.io.*;
class EBbill
{
public static void main(String arg[])throws IOException
{
double amount;
DataInputStream d=new DataInputStream(System.in);
System.out.println("Enter the Customer code ");
int customer_code=Integer.parseInt(d.readLine());
System.out.println("Enter Current reading ");
int cur_read=Integer.parseInt(d.readLine());
System.out.println("Enter the preveous Reading");
int pre_read=Integer.parseInt(d.readLine());
int unit=cur_read-pre_read;
System.out.println("This EBbill Home / Business Type (B/H)?");
String type=d.readLine();
char firstchar=type.charAt(0);
char secondchar=type.charAt(1);
if(firstchar=='B' || firstchar=='b')
{
amount=unit*9;
System.out.println("The Amount is "+amount);
}
else
{
if(unit<=100)
{
amount=unit*0.50;
System.out.println("This Amount is "+amount);
}
else
if(unit<=200)
{
amount=50+(unit*1.00);
System.out.println("This Amount is "+amount);
}
else
if(unit<=300)
{
amount=50+100+(unit*2.00);
System.out.println("This Amount is "+amount);
}
else
if(unit<=500)
{
amount=50+100+200+(unit*5.00);
System.out.println("This Amount is "+amount);
}
}
}
}
