class A extends Thread{
	
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.print("A ");
		}
	}
}
class B extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("B ");
		}
	}
}
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		B obj1 = new B();
		obj.start();
		obj1.start();
	}

}
