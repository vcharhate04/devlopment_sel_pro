package aa.aa;



public class Praticese01 {
  
// method with same name but different form
	   void sum(int a, int b) {
		   System.out.println("Int arg method nvoked");
		   }
	   void sum(long a, long b) {
		   System.out.println("long arg method invoked");
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {1, 2, 3};
		System.out.println(a[0]); // 1

		a[0] = 9;
		System.out.println(a[0]); // 9
    
		System.out.println(a.length); // 3

		Praticese01 ab =new Praticese01();
		ab.sum(20,20);
	}

}
