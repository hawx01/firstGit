package test;

import java.util.List;

public class Thread2 extends Thread {
	List<String> list1 =null;
public Thread2(List list) {
	this.list1 = list;
}
@Override
public void run() {
	 System.out.println("endddd");;
}
}
