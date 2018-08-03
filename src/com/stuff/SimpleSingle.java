package com.stuff;

public class SimpleSingle {
    public static SimpleSingle simpleSingle;
    public int i = 1;
    //私有化构造方法
    private SimpleSingle(){
    }
    
    public synchronized static SimpleSingle getInstence1(){
    	if(simpleSingle==null){
    		simpleSingle = new SimpleSingle();
    	}
    	return simpleSingle;
    }
    //双重检查的单例模式，更有效，更节省资源
    public static SimpleSingle getInstence(){
    	if(simpleSingle==null){
    		synchronized (SimpleSingle.class) {
				if(simpleSingle==null){
					simpleSingle = new SimpleSingle();
				}
			}
    	}
    	return simpleSingle;
    }
    
}
