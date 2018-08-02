package com.pro;

public class SingleTest {
    private static SingleTest singleTest;
    private int count = 0;
    public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getCourentUser() {
		return courentUser;
	}
	public void setCourentUser(String courentUser) {
		this.courentUser = courentUser;
	}
	private String courentUser = "admin";
    private SingleTest(){
    }
    public static SingleTest getInstence(){
    	if(singleTest==null){
    		synchronized (SingleTest.class) {
				singleTest = new SingleTest();
			}
    	}
    	return singleTest;
    }
}
