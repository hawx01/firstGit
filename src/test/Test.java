package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Test {
	public void runth(Runnable run) {
	 Thread t=new Thread(run);
	 t.start();
	try {
		t.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 class Inn{
		 Inn(){
			 System.out.println("Inn is creat");
		 }
		 public void test(){
			 System.out.println("Inn test");
		 }
	 }
		Inn inn=new Inn();
		inn.test();
	
	}
	/**
	 * ƽ���齱��
	 * @param num
	 * @return
	 */
	public static int 	drawAlgorithm(int num){
		if(num>0){
			Random random = new Random();
			int value = Math.abs(random.nextInt()) %num +1;
			return value;
		}
		return -1;
	}
	/**
	 * 
	 * @param map ,keyΪ�û���ţ��ŵ�һλ�ı��Ϊ0����2λΪ1...valueΪ��Ӧ��Ͷ����
	 * @return �н����
	 */
	public int 	drawAlgorithm(Map<Integer,Double> map){
		List<Integer> orderlist=new ArrayList<Integer>();
		Map<Integer,Integer[]> offesetMap=new HashMap<Integer, Integer[]>();
		//ȡ��map��key��orderlist
		Set<Integer> set=map.keySet();
		Iterator<Integer> ite=set.iterator();
		while(ite.hasNext()){
			int key=ite.next();
			double value=map.get(key);
			orderlist.add(key);
			
		}
		//��orderlist ����С��������
		Collections.sort(orderlist);
		//��������������
		int all=1;
		for(Integer num:orderlist){
			Double value=map.get(num);
			if(value!=null){
			Integer[] range= new Integer[2];
			if(value>0){
				range[0]=all;
				int end=(int) (value/0.01);
				range[1]=all+end-1;
				all+=end;
			}
			offesetMap.put(num, range);
			}
		}
		System.out.println("�ܹ���"+(all-1));
		int draw=drawAlgorithm(all-1);
		System.out.println("�齱ֵ��"+draw);
		int value=-1;
		Iterator<Integer> offsetmapite=offesetMap.keySet().iterator();
		
		while(offsetmapite.hasNext()){
			int key=offsetmapite.next();
			Integer[] range =offesetMap.get(key);
			int start=range[0];
			int end=range[1];
			System.out.println("��ǰ��ţ�"+key+",start:"+start+",end:"+end);
			if(start<=draw && draw<=end){
				value=key;
				System.out.println("�н���ţ�"+key);
				//break;
			}
		}
		return value;
	}
	public static void main(String[] agr){
		
		 int a=1;
		 do {
			System.out.println("dddd");
			a++;
		} while (a<3);
		 
	
	}

	public static int[] drawAlgorithm(List<Integer[]> offsetlist) {
		
		// ��������������
		int all = offsetlist.get(offsetlist.size() - 1)[1];

	 System.out.println("�ܹ���" + all);
		int draw = drawAlgorithm(all)+1;
	 System.out.println("�齱ֵ��" + draw);
		int no = -1;

		for (int key = 0; key < offsetlist.size(); key++) {
			Integer[] range = offsetlist.get(key);
			int start = range[0];
			int end = range[1];
			 System.out.println("��ǰ��ţ�" + key + ",start:" + start + ",end:" +
			end);
			if (start <= draw && draw <= end) {
				no = key;
				 System.out.println("�н���ţ�" + key);
				//break;
			}
		}
		return new int[] { no, draw };
	}
}
