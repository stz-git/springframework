package com.imooc.entity.factory;

import com.imooc.entity.User;

/**
 * @Copyright: Soul
 * @author: tianyu@soulapp.cn
 * @Date: 2021/11/16 3:46 下午
 * @Description:
 */
public class StaticFactory {

	public static User getUser() {
		return new User();
	}
}
