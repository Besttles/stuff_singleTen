package com.stuff;
//�ڲ���ʵ�ֵ���ģʽ
public class InnerSingle {
   private InnerSingle(){}
   private static class holder{
	   private static final InnerSingle inner = new InnerSingle();
   }
   public static InnerSingle getSingle(){
	   return holder.inner;
   }
}
