package arrayconcept;
import java.util.Scanner; 
class arrayelements
{
    Scanner s= new Scanner(System.in);
    int a[]=new int[50],i,n;
    void get()
    { 
	    System.out.println("Enter how many elements");
        n=s.nextInt();
	    System.out.println("Enter the numbers");
        for(i=0;i<n;i++)
	    a[i]=s.nextInt();
        
 	    System.out.println("Print the array elements");
	    for(i=0;i<n;i++)
	        System.out.println(a[i]);
    }

    void insert()
    {
         System.out.println("Do you want to insert any element (yes/no)?");
         String ans=s.next();
         if(ans.equalsIgnoreCase("yes"))
         {
         	System.out.println("Enter the new element");
         	int newele=s.nextInt();
         	System.out.println("New element stored direct location");
         	int location=s.nextInt();
                if(location>n)
                   System.out.println("index "+location+" out of bounds exception");
                else
                {
         	    for(i=n-1;i>=location;i--)
	 	          a[i+1]=a[i];
         	    
        	    a[location]=newele;
        	    
         	    System.out.println("After insert element");
         	    for(i=0;i<=n;i++)
            	        System.out.println(+a[i]);
         	    
         	    n++;
              
                insert();
               }
         }
         else
         System.out.println("end");
    }
}

public class insertarrelement 
{
	public static void main(String[] args)
	{
		     arrayelements ae=new arrayelements();
		     ae.get();
		     ae.insert();
    }
}
