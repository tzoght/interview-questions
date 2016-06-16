package com.zoght;

import com.zoght.example.ioc.module.ExampleIoCModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.zoght.guice.service.FooService;

public class GuiceIoCExample {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new ExampleIoCModule());
		FooService service = injector.getInstance(FooService.class);
		service.execute();

	}

}
