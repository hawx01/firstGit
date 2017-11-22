package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test4   extends Thread{

	private Map map ;
	public Test4( Map map) {
		this.map =map;
	}
	@Override
	public void run() {
		Iterator ite = map.keySet().iterator();
		int a =0;
		while (a<50){
			System.out.println("put:"+"a"+a);
			map.put("a"+a, a);
			
			a++;
			
		}
		
	}
	
	public static void main(String[] a){
		
//		Map<String,Object> map =new HashMap<String,Object>();
//		map.put("b1", 200);
//		map.put("b2", 201);
//		map.put("b2", 202);
//		map.put("b3", 203);
//		map.put("b4", 204);
//		Test3 t3=new Test3(map);
//		Test4 t4 =new Test4(map);
//		t4.start();
//		t3.start();
		
		List<String> test = new ArrayList<String>();
		test.add("1");
		test.add("2");
		test.add("3");
		test.add("4");
		Thread2 t2= new Thread2(test);
		Thread3 t3= new Thread3(test);
		t2.start();
		try {
			Thread.sleep(500l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		test =  new ArrayList<String>();
	}
}
