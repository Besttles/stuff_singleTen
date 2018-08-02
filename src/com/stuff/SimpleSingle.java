package com.stuff;

public class SimpleSingle {
    public static SimpleSingle simpleSingle;
    public int i = 1;
    //私有的无参构造方法
    private SimpleSingle(){
    }
    
    public synchronized static SimpleSingle getInstence1(){
    	if(simpleSingle==null){
    		simpleSingle = new SimpleSingle();
    	}
    	return simpleSingle;
    }
    //这种方式同样是实现线程安全，但是这种方法可以节省空间，如果这个类已经进行实例化，就不需要再进行同步，从而节省资源
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
