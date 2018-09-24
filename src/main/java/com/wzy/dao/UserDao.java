package com.wzy.dao;

import com.wzy.model.User;

/** 
* @ClassName: UserMapper 
* 
* @author wangzhongyi
* @date 2018-9-20 14:12:38
*/
public interface UserDao {
	User selectUserByName(String name);
}
