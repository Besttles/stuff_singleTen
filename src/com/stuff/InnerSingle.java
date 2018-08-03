package com.stuff;
//内部类的形式实现单例模式
public class InnerSingle {
   private InnerSingle(){}
   private static class holder{
	   private static final InnerSingle inner = new InnerSingle();
   }
   public static InnerSingle getSingle(){
	   return holder.inner;
   }
}
