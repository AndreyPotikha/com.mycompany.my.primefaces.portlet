package com.mycompany.my.primefaces.portlet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import java.io.Serializable;

@ManagedBean(name="testPortlet")
@SessionScoped
public class TestPortlet implements Serializable {
	private String name = "Andrey";
	private String age = "23";
	private String tall;
	private String result;

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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTall() {
		return tall;
	}

	public void setTall(String tall) {
		this.tall = tall;
	}

	public void countWeight() {
		float tall = Float.parseFloat(getTall());
		int age = Integer.parseInt(getAge());
		if (age <= 40) {
			tall = tall - 110;
		} else {
			tall = tall - 100;
		}
		result = "Dear " + name + ", your optimal weight is: " + String.valueOf(tall);
	}

}
