/*
a[]={12,5,9,8,4}
ans 12,9,8,4
*/
import java.util.Scanner;
class leader
{
public static void main(String arg[])
{
int i,j,leaderno,notbig;
int a[]=new int[50];
Scanner s=new Scanner(System.in);
System.out.println("How many element to be stored ");
int n=s.nextInt();
System.out.println("Enter numbers");
for(i=0;i<n;i++)
a[i]=s.nextInt();

System.out.println("Leader Numbers");
for(i=0;i<n;i++)
{
leaderno=a[i];
notbig=0;
      for(j=i+1;j<n;j++)
      {
          if(leaderno<=a[j])
           {
               notbig=1;
               break;
           }
     }
     if(notbig==0)
     System.out.println(leaderno);
}
}
}
