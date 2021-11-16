package com.imooc.controller;

import com.imooc.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Copyright: Soul
 * @author: tianyu@soulapp.cn
 * @Date: 2021/11/16 3:09 下午
 * @Description:
 */
@Controller
public class WelcomeController {

	@Autowired
	private WelcomeService welcomeService;

	public void handleRequest() {
		welcomeService.sayHello("来自controller的问候");
	}
}
