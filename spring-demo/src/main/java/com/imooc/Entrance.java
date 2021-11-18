package com.imooc;

import com.imooc.controller.WelcomeController;
import com.imooc.entity.User;
import com.imooc.entity.factory.UserFactoryBean;
import com.imooc.service.WelcomeService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @Copyright: Soul
 * @author: tianyu@soulapp.cn
 * @Date: 2021/11/16 2:31 下午
 * @Description:
 */
@Configuration
@ComponentScan(value = "com.imooc")
public class Entrance {
	public static void main1(String[] args) {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("//Users/tianyu/IdeaProjects/spring-framework-5.2.0.RELEASE/spring-demo/src/main/resources/spring/spring-config.xml");
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
//		WelcomeService welcomeService = applicationContext.getBean("welcomeService", WelcomeService.class);
//		welcomeService.sayHello("tianyu");

		User user1a = applicationContext.getBean("user1", User.class);
		User user1b = applicationContext.getBean("user1", User.class);
		System.out.println("user1a: " + user1a);
		System.out.println("user1b: " + user1b);

		User user2a = applicationContext.getBean("user2", User.class);
		User user2b = applicationContext.getBean("user2", User.class);
		System.out.println("user2a: " + user2a);
		System.out.println("user2b: " + user2b);

		User user3a = applicationContext.getBean("user3", User.class);
		User user3b = applicationContext.getBean("user3", User.class);
		System.out.println("user3a: " + user3a);
		System.out.println("user3b: " + user3b);

		UserFactoryBean userFactoryBean1a = applicationContext.getBean(BeanFactory.FACTORY_BEAN_PREFIX + "userFactoryBean", UserFactoryBean.class);
		UserFactoryBean userFactoryBean1b = applicationContext.getBean(BeanFactory.FACTORY_BEAN_PREFIX + "userFactoryBean", UserFactoryBean.class);
		System.out.println("userFactoryBean1a: " + userFactoryBean1a);
		System.out.println("userFactoryBean1b: " + userFactoryBean1b);
	}

	public static void main2(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
		WelcomeController welcomeController = applicationContext.getBean("welcomeController", WelcomeController.class);
		welcomeController.handleRequest();
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		Environment environment = applicationContext.getEnvironment();
		String[] activeProfiles = environment.getActiveProfiles();

		String param1 = environment.getProperty("param1");
		System.out.println("param1: " + param1);

		String param2 = environment.getProperty("param2");
		System.out.println("param2: " + param2);


		for (String activeProfile : activeProfiles) {
			System.out.println("activeProfile: " + activeProfile);
		}
		String[] defaultProfiles = environment.getDefaultProfiles();
		for (String defaultProfile : defaultProfiles) {
			System.out.println("defaultProfile: " + defaultProfile);
		}
	}
}
