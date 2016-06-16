package com.zoght.guice.example;

public class PojoToInject {

	String msg = "" + this.getClass().getClassLoader().getResource("") + this.getClass().getClassLoader().getParent().toString();
	@Override
	public String toString() {
		try {
			Thread.currentThread().dumpStack();
		}
		catch (Exception e) {

		}
		return "Feitooooo!! " + msg;
	}
}
