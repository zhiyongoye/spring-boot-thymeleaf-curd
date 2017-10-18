package com.neo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //代表实体类
public class User {
	/****
	 * JPA提供的四种标准用法是 table sequence identity auto
	 * table 使用一个特定的数据库表格来保存主键
	 * sequence 顺序 根据底层数据库的序列生成主键,条件是数据库支持序列
	 * identity 同一性  主键由数据库自动生成 (主要是自动增长型)
	 * auto 主键由程序控制
	 */
	@Id //声明此属性为主键
	@GeneratedValue //指定主键的生成策略 默认是Auto 主键由程序控制
	private long id;
	/****
	 * column 实体类的属性与数据库中字段的对应关系
	 * nullable 表示该字段是否可以为null值    默认是true
	 * unique 表示该字段是否是唯一标识 默认是false
	 */
	@Column(nullable = false, unique = true)
	private String userName;
	
	@Column(nullable = false )
	private String password;
	
	@Column(nullable = false)
	private int age;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
