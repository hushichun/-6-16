package test1;

import java.util.Date;

public class Test {
	
		public static void main(String[] args) {
			String curTime = String.valueOf((new Date()).getTime() / 1000L);
			System.out.println(curTime);
			long line=new Date().getTime();
			System.out.println(line);
		}
}
