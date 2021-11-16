package com.imooc.service.impl;

import com.imooc.service.WelcomeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Copyright: Soul
 * @author: tianyu@soulapp.cn
 * @Date: 2021/11/16 2:22 下午
 * @Description:
 */
@Scope
@Service
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String sayHello(String name) {
		System.out.println("欢迎你: " + name);
		return "success";
	}
}
