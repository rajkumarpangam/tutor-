package com.klu.JSFApp;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="clac", eager=true)
public class Claculator {
	
	int a;
	int b;
	int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public void add()
	{
		c=a+b;	}

}
