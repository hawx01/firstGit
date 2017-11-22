package test;

public class Thread1 extends Thread {

	private byte[] a ;
	public Thread1(byte[] a) {
		this.a=a;
	}
	@Override
	public void run() {
		System.out.println("threa1: run");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("threa1: end");
	}
}
