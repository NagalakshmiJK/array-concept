/*
print non duplicate element
a[]={4,2,5,2,4}
o/p=5
*/
import java.util.Scanner;
class nonduplicate
{
public static void main(String arg[])
{
     int i,n,j,nonduplicateno,duplicateno=0;
     int a[]=new int[50];
     Scanner s = new Scanner(System.in);
     System.out.println("How many element in array");
     n=s.nextInt();
     for(i=0;i<n;i++)
          a[i]=s.nextInt();
    
    for(i=0;i<n;i++)
    {
    nonduplicateno=0;
          for(j=0;j<n;j++)
          {
                if(a[i]==a[j])
                nonduplicateno++;
          }
         if(nonduplicateno==1)
         {
               duplicateno++;
               System.out.println("Non duplicate element "+a[i]);
         }
    }
    if(duplicateno==0)
    System.out.println("Not accured Non Duplicate Element");
   
}
}