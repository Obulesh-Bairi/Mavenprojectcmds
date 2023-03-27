package Debugging;

public class DebuggingBasics {
	
	
	public void ADD()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("c="+c);
	}
	
	

	public void mul()
	{
		int a=10;
		int b=20;
		int c=b*a;
		System.out.println("mul="+c);
	}
	
	
	public void SUB()
	{
		int a=10;
		int b=20;
		int c=b-a;
		System.out.println("SUB="+c);
	}
	
	
	public  static void main(String[]args)
	{
		
		
		DebuggingBasics db = new DebuggingBasics();
		
		System.out.println("testing from windows");
	}
	
	
	
	
	
}
