package com.designpattern.singleinstance;

/**
 * 静态内部类的方式
 */
public class Teacher_InnerStaticClass {

	private String name;
	private static Teacher_InnerStaticClass mInstance;

	private Teacher_InnerStaticClass(String name) {
		System.out.println("C:" + name);
		this.name = name;
	}

	public static Teacher_InnerStaticClass getInstance() {
		return TeacherInstanceHolder.mInstance;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public static class TeacherInstanceHolder {
		private static final Teacher_InnerStaticClass mInstance = new Teacher_InnerStaticClass(
				"zhangsan");
	}
}
