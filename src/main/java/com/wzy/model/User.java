package com.wzy.model;

/**
 * @ClassName: User
 * 
 * @author wangzhongyi
 * @date 2018-9-20 14:12:42
 * 
 */
public class User {
	private String userName;

	private String sex;

	private String age;

	private String time;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User{" + "userName=" + userName + ",sex=" + sex + ",age=" + age + ",time=" + time;
	}
}
