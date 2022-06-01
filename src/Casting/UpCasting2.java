 package Casting;

public class UpCasting2 extends UpCating 
{
   void manya2()
   {
	   System.out.println("from sub class");
   }
	
	void manya4()
	{
		System.out.println("from sub class");
	}
	public static void main(String[] args) {
		
		
		UpCasting2 n = new UpCasting2();
		n.manya1();
		n.manya2();
		n.manya3();
		n.manya4();
		
		UpCating m = new UpCating ();
		m.manya1();    // up casting is done
		m.manya3();
	//	m.manya2(); not possible in up casting because sub class methode
	//	m.manya4();
		
	}
	
	
}
