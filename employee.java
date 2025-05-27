import  java.util.Scanner;
class employee
{
public static void main(String arg[])
{
int e[]=new int[50];
int hours,target_hours,max_hours=0;
Scanner s=new Scanner(System.in);
System.out.println("How many Employess in your company ");
int no_emp=s.nextInt();

System.out.println("Enter employee working hours");
for(hours=1;hours<=no_emp;hours++)
{
e[hours]=s.nextInt();

if(e[hours]>max_hours)
max_hours=e[hours];
}

System.out.println("Target of Daily working hours in our company ");
target_hours=s.nextInt();

System.out.println("\n Target of company working hours followed employees");
for(hours=1;hours<=no_emp;hours++)
{
     if(target_hours<=e[hours])
    {
        System.out.println("Employee "+ hours );
    }
}
System.out.println("\n Too many hours working employees");
 
for(hours=1;hours<=no_emp;hours++)
{
     if(max_hours==e[hours])
     System.out.println("Employee "+hours +"  working hours :"+e[hours]);
}

}
}