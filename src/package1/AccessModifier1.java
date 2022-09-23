package package1;


public class AccessModifier1 
{
	//static variables
public static int a=10;        //public is valid up to same project
static int b =20;             // default is valid up to same package
private static int c=30;     //private is valid up to same class
protected static int d=40;  //protected is valid up to same package but protected access
                           // we want to try in another package then use concept of inheritance


public int e=50;
int f=50;                    //non static variables
private int g=60;
protected int h=70; 



		public static void staticmethod()                                  //static method
		
		{System.out.println("Access Modifier 1 = this is static method");}
	
		public void nonstaticmethod()                                      //non static method
		{System.out.println("Access Modifier 1 = this is non static method");}
		
		
		public static void main(String[] ars)                            //system defined method
		{
		AccessModifier1.staticmethod();   //recalling for static method
			
			System.out.println(a);
			System.out.println(b);       //recalling for static variable
			System.out.println(c);
			System.out.println(d);
			
	System.out.println("***********************************************************");
		
			AccessModifier1 x = new AccessModifier1();      //object
			x.nonstaticmethod();                           //recalling for non static method
			System.out.println(x.e);     //public	
			System.out.println(x.f);    //default         //recalling for non static variable
			System.out.println(x.g);   //private
			System.out.println(x.h);  //protected
		}
}









