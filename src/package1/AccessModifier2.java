package package1;

public class AccessModifier2 
{
	public int h=12;	

		public static void main(String[] ars)
		{
			
			AccessModifier1.staticmethod();
			
			System.out.println(AccessModifier1.a);       //public
			System.out.println(AccessModifier1.b);      //default
			//System.out.println(AccessModifier1.c);   //private
			System.out.println(AccessModifier1.d);    //protected
			
			
	System.out.println("***************************************************");
		
	

	       AccessModifier1 x = new AccessModifier1();
	       x.nonstaticmethod();                               //recalling for non static method
	       System.out.println(x.e);       //public	
	       System.out.println(x.f);      //default           //recalling for non static variables
	      //System.out.println(x.g);   //private
	       System.out.println(x.h);    //protected
			
		}
}
