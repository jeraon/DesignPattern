package com.designpattern.singleinstance;

/**
 * Double Checking Lock式单例模式
 */
public class Teacher_DCL {

	private String name;
	private static volatile Teacher_DCL mInstance;

	private Teacher_DCL(String name) {
		this.name = name;
	}

	/**
	 * DLC方式单例模式基于懒汉式；
	 * 懒汉式虽能保证对象过多的实例化，但是存在线程安全问题，因此需要同步，而synchronized关键字影响效率，因此出现了DCL模式。
	 * DCL方式需要对实例加volatile关键字，保证读取最新的值，有JVM1.5之前该关键字语义不强，因此该方式不适用于jdk1.5前的版本。
	 * 
	 * @return
	 */
	public static Teacher_DCL getInstance() {
		if (mInstance == null) {
			synchronized (Teacher_DCL.class) {
				if (mInstance == null) {
					mInstance = new Teacher_DCL("zhangsan");
				}
			}
		}
		return mInstance;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
