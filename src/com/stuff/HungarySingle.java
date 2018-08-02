package com.stuff;

public class HungarySingle {
    private static final HungarySingle hungary = new HungarySingle();
    
    private HungarySingle(){
    	
    }
    
    public HungarySingle getSingle(){
    	return hungary;
    }
}
