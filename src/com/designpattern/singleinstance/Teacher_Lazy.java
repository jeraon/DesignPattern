package com.designpattern.singleinstance;
/**
 * 懒汉式
 */
public class Teacher_Lazy {

	private String name;
	private static Teacher_Lazy mInstance;
	private Teacher_Lazy(String name){
		this.name = name;
	}
	/**
	 * 懒汉式虽能保证对象过多的实例化，但是存在线程安全问题，因此需要同步，而synchronized关键字影响效率
	 * @return
	 */
	public static synchronized Teacher_Lazy getInstance(){
		if (mInstance == null){
			mInstance = new Teacher_Lazy("zhangsan");
		}
		return mInstance;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
