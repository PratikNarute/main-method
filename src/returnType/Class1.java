package returnType;

public class Class1 
{
   static int a=10, b=20;
  private static int c;
   
   public static int addition()
   {
	  c=a+b; 
	  System.out.println(c);
	  
	  return c;
   }
   
   
	
  public static void main(String[] args) 
  {
     Class1.addition();
	
     int d=c;
 
    System.out.println(d);
	
     

	
	  
	  
  }
}
