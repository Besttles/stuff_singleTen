package com.pro;

public class Main3 {
public static void main(String[] args) {
	SingleTest instence = SingleTest.getInstence();
	for (int i = 0; i < 5; i++) {
		

	new Thread(){
		@Override
		public void run() {
			SingleTest instence = SingleTest.getInstence();
			instence.setCount(instence.getCount()+1);
			instence.setCourentUser("lili");
			System.out.println(instence.getCount()+instence.getCourentUser());
		}
	}.start();
	new Thread(){
		@Override
		public void run() {
			SingleTest instence = SingleTest.getInstence();
			instence.setCount(instence.getCount()+1);
			instence.setCourentUser("qiqi");
			System.out.println(instence.getCount()+instence.getCourentUser());
		}
	}.start();
  }
}
}
