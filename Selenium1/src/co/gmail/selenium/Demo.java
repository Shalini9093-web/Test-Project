package co.gmail.selenium;

public class Demo {
	int b = 100;

	public void add() {
		byte a = 10;//Implicit which done automatically.
		int i=a;
		
		long l=458;
		int a1=(int) l;//Explicit which we doing manually.
		System.out.println(a1);
	}

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.add();
		System.out.println();

	}

}
