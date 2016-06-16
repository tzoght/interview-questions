package com.zoght.guice.service;

import com.google.inject.Inject;
import com.zoght.guice.service.FooService;
import com.zoght.guice.example.PojoToInject;

public class FooService {

	private final PojoToInject pojo;

	@Inject
	public FooService(PojoToInject pojo) {
		this.pojo = pojo;
	}

	public void execute() {
		System.out.println(pojo.toString());
	}
}
