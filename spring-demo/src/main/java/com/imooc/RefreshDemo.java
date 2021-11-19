package com.imooc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 */
@Configuration
@ComponentScan(value = "com.imooc")
public class RefreshDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(RefreshDemo.class);
//		ObjectProvider<TestAware> beanProvider = applicationContext.getBeanProvider(TestAware.class);
//		System.out.println(beanProvider);
//		boolean flag = applicationContext.isSingleton("tianyu");
//		System.out.println(flag);
		String[] aliases = applicationContext.getAliases("tianyu");
		System.out.println(Arrays.toString(aliases));
	}
}
