package com.stuff;

public class SimpleSingle {
    public static SimpleSingle simpleSingle;
    public int i = 1;
    //˽�е��޲ι��췽��
    private SimpleSingle(){
    }
    
    public synchronized static SimpleSingle getInstence1(){
    	if(simpleSingle==null){
    		simpleSingle = new SimpleSingle();
    	}
    	return simpleSingle;
    }
    //���ַ�ʽͬ����ʵ���̰߳�ȫ���������ַ������Խ�ʡ�ռ䣬���������Ѿ�����ʵ�������Ͳ���Ҫ�ٽ���ͬ�����Ӷ���ʡ��Դ
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
