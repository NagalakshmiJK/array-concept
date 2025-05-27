/*
print non dublicate element
a[]={4,2,5,2,4}
o/p=5
*/
import java.util.Scanner;
class nondublicate
{
public static void main(String arg[])
{
     int i,n,j,nondublicateno,dublicateno=0;
     int a[]=new int[50];
     Scanner s = new Scanner(System.in);
     System.out.println("How many element in array");
     n=s.nextInt();
     for(i=0;i<n;i++)
          a[i]=s.nextInt();
    
    for(i=0;i<n;i++)
    {
    nondublicateno=0;
          for(j=0;j<n;j++)
          {
                if(a[i]==a[j])
                nondublicateno++;
          }
         if(nondublicateno==1)
         {
               dublicateno++;
               System.out.println("Non dublicate element "+a[i]);
         }
    }
    if(dublicateno==0)
    System.out.println("Not accured Non Dublicate Element");
   
}
}