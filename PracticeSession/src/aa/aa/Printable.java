package aa.aa;

public interface Printable {

	//Question 41
	
	void print();
	}
	interface Showable extends Printable
	{
	void show();
		
	}
	
	class Testinterface implements Showable{
		
		
	public void show() {System.out.println("show");}
	
	public void print() {System.out.println("print");}
	
	public static void main(String args[]) {
	Testinterface obj = new Testinterface();
	
	obj.show();
	obj.print();
	
	
}}
