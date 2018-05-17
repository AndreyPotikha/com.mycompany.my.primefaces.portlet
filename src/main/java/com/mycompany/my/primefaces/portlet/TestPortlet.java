package com.mycompany.my.primefaces.portlet;

import com.mycompany.my.primefaces.portlet.service.TestService;
import com.mycompany.my.primefaces.portlet.service.impl.TestServiceImpl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name="testPortlet")
@SessionScoped
public class TestPortlet implements Serializable {
	private String name;
	private int age;
	private int tall;
	private String result;

	private TestService testService = new TestServiceImpl();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTall() {
		return tall;
	}

	public void setTall(int tall) {
		this.tall = tall;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void countWeight() {
		 result = testService.countWeight(name, age, tall);
	}
}