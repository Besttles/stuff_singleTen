package com.stuff;

public class MainTest {
public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
		SimpleSingle instence = SimpleSingle.getInstence();
		instence.i++;
		new Thread(){
			@Override
			public void run() {
				SimpleSingle instence = SimpleSingle.getInstence();
				System.out.println(instence.i-1);
			}
		}.start();
		System.out.println(instence.i);
	}
	//ͨ���ڲ������ʽ����ʵ��
	InnerSingle single = InnerSingle.getSingle();
}
}
