package com.wzy.service;

import com.wzy.model.User;

/** 
* @ClassName: UserService 
* 
* @author wangzhongyi
* @date 2018-9-20 14:12:09
*  
*/
public interface UserService {
	User selectUserByName(String userName);
	
}
