package test;

import java.util.Iterator;
import java.util.Map;

public class Test3  extends Thread{

	private Map map ;
	public Test3( Map map) {
		this.map =map;
	}
	@Override
	public void run() {
		Iterator ite = map.keySet().iterator();
		while (ite.hasNext()){
			System.out.println( "sjsljs:"+map.get(ite.next()));
		}
		
	}
}
