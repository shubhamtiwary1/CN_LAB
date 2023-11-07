import java.util.Scanner;
class WorkerThread extends Thread{
	int x,y;
	WorkerThread(int n1, int n2){
		x = n1;
		y = n2;
	}
	public void run() {
		int result = x+y;
		onResult(result);
	}
	void onResult(int result) {
		System.out.println("Received result form the thread: "+ result);
	}
}
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		WorkerThread workerThread = new WorkerThread(a,b);
		workerThread.start();
	}

}
