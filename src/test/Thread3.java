package test;

import java.util.List;

public class Thread3 extends Thread {
	List<String> list1 = null;

	public Thread3(List list) {
		this.list1 = list;
	}

	@Override
	public void run() {
		for(int a=0;a<10;a++){
			System.out.println("Thread 3: add list :"+ a);
			list1.add("a"+a);
		}
	}
}
