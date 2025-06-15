import java.util.Scanner; 
class arrayelements
{
    Scanner s= new Scanner(System.in);
    int a[]=new int[50],i,n;
    static int countinsert=0;
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
		n+=countinsert;
         	countinsert++;
         	System.out.println("Enter the new element");
         	int newele=s.nextInt();
         	System.out.println("New element stored direct location");
         	int location=s.nextInt();
                if(location<n)
                   System.out.println("index out of bounds "+location);
                else
                {
         	    for(int j=n-1;j>=location;j--)
	 	         a[j+1]=a[j];
         	
        	    a[location]=newele;
         	    System.out.println("After insert element");
         	    for(i=0;i<=n;i++)
         	    {
            	        System.out.println(a[i]);
         	    } 
                 
                    insert();
               }
         }
         else
         System.out.println("end");
    }
}
class insertarrelement
{
public static void main(String arg[])
{
     Scanner x=new Scanner(System.in);
     arrayelements ae=new arrayelements();
     ae.get();
     ae.insert();
}
}