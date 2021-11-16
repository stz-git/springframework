package com.imooc.entity.factory;

import com.imooc.entity.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Copyright: Soul
 * @author: tianyu@soulapp.cn
 * @Date: 2021/11/16 5:18 下午
 * @Description:
 */
public class UserFactoryBean implements FactoryBean<User> {

	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
