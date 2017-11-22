package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Test2 {
	public static String getFormatedDateString(String _timeZone, String d, String c, String b, String s, String t,
			String r, String f) throws Exception, NullPointerException, RuntimeException {
		TimeZone timeZone = null;
		if (_timeZone == "") {
			timeZone = TimeZone.getDefault();
			System.out.println(timeZone);
		} else {
			timeZone = TimeZone.getTimeZone(_timeZone);
		}

		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm");
		sdf.setTimeZone(timeZone);
		// TimeZone.setDefault(timeZone);
		return sdf.format(new Date());
	}

	public static void ci(Integer c) {
		c += 1;
		String a = null;
		a.charAt(1);
	}

	public static void testex(){
		try {
			
			throw new RuntimeException("sxxld");
		} catch (RuntimeException e) {
			
			throw new RuntimeException("sxxld1111");
		}catch (Exception e) {
			System.out.println("trhow 2");
			e.printStackTrace();
			//throw new Exception(e.getMessage());
		}
	}
	public static void main(String args[]) {
		// boolean f = Pattern.compile("^/admin/",
		// Pattern.MULTILINE).matcher("/admin/ds/lo.do").find();
		// // String a="23.34";
		// String a="2.3万";
		boolean f1 = true;
//		try {
//			// StatTrak™ Glock-18 | Catacombs (Factory New),★ StatTrak™ Huntsman
//			// Knife | Blue Steel (Minimal Wear)
//			System.out.println(f1 == false);
//			String st = "StatTrak™ ";
//			String m1 = "★ StatTrak™ Huntsman Knife | Blue Steel (Minimal Wear)";
//			// String m1 = "StatTrak™ Glock-18 | Catacombs (Factory New)";
//			int st1 = m1.indexOf(st);
//			if (st1 >= 0) {
//				System.out.println(m1.substring(500));
//			}
//		} finally {
//			
//		}
	 String key ="123_htm_22";
	 int firt_index = key.indexOf("_");
	 System.out.println(Integer.parseInt(key.substring(0,firt_index)));
	 System.out.println(key.substring(firt_index + 1));
	}

}
