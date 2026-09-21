import java.util.*;
class Numberthread extends Thread{
	public void run(){
		Random r = new Random();
		int n = r.nextInt(10);
	System.out.println("Thread 1 : Generated " + n);
	if (n%2==0) new SquareThread(n).start(); 
	else new CubeThread(n).start();
	}
}
class SquareThread extends Thread{
	int n;
	SquareThread(int n){
		this.n = n;
	}
	public void run (){
		System.out.println("Thread 2=> Square of "+n+":"+n*n);
	}
}
class CubeThread extends Thread{
        int n;
        CubeThread(int n){
                this.n = n;
        }
        public void run (){
                System.out.println("Thread 3=> cube of "+n+":"+n*n*n);
        }
}
class thread{
	public static void main(String[] args){
		Numberthread t = new Numberthread();
		t.start();
	}
}
