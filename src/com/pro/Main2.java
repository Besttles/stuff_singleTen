package com.pro;

public class Main2 {
  public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			

		new Thread(){
			@Override
			public void run() {
				SingleTest instence = SingleTest.getInstence();
				instence.setCount(instence.getCount()+1);
				instence.setCourentUser("lili");
				Main3.main(args);
				System.out.println(instence.getCount()+instence.getCourentUser());
			}
		}.start();
		new Thread(){
			@Override
			public void run() {
				SingleTest instence = SingleTest.getInstence();
				instence.setCount(instence.getCount()+1);
				instence.setCourentUser("qiqi");
				Main3.main(args);
				System.out.println(instence.getCount()+instence.getCourentUser());
			}
		}.start();
	  }
}
}
