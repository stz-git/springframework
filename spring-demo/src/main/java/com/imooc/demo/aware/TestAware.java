package com.imooc.demo.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * 测试Spring上下文在启动时各操作的感知回调
 */
@Component(value = "tianyu")
public class TestAware implements BeanNameAware, BeanFactoryAware {

	@Override
	public void setBeanName(String name) {
		System.out.println("Aware beanName: " + this.getClass() + ":" + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Aware beanFactory: " + this.getClass() + ":" + beanFactory);
	}
}
