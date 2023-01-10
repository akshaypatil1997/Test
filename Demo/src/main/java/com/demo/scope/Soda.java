package com.demo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value =ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.DEFAULT.TARGET_CLASS)
public class Soda {
	
	public Soda() {
		System.out.println("this is soda class");
	}
	
	public void getSoda() {
		System.out.println("this is soda method");
	}

}
