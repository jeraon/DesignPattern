package com.designpattern.singleinstance;
/**
 * 饿汉式单例模式
 */
public class Teacher_Early {

	private String name;
	private static final Teacher_Early mInstance = new Teacher_Early("zhangsan");
	private Teacher_Early(String name){
		this.name = name;
	}
	public static Teacher_Early getInstance(){
		return mInstance;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
