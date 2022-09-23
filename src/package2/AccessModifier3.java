package package2;
import package1.AccessModifier1;

public class AccessModifier3 extends AccessModifier1  // Inheritance
{

	
	public static void main(String[] ars)
	{
		
		AccessModifier1.staticmethod();                   //recalling for static method
		
		System.out.println(AccessModifier1.a);          //public
		//System.out.println(AccessModifier1.b);       //default
		//System.out.println(AccessModifier1.c);      //private
		System.out.println(AccessModifier1.d);       //protected
		
		
	System.out.println("******************************************************");
		
		

	    AccessModifier1 x = new AccessModifier1();            //object
	    x.nonstaticmethod();                                 //recalling for non static method
	    System.out.println(x.e);          //public	
	    //System.out.println(x.f);       //default         //recalling for non static variable
	    //System.out.println(x.g);      //private
	    //System.out.println(x.h);      //protected
	
	    
	    AccessModifier3 y=new AccessModifier3();    //  recall  protected access from another package
	    System.out.println(y.h);
	    
	    
	    
	

	
		
	}
}
