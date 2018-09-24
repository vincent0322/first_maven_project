package com.wzy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzy.dao.UserDao;
import com.wzy.model.User;
import com.wzy.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * 
 * @author wangzhongyi
 * @date 2018年9月20日14:12:21
 * 
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User selectUserByName(String userName) {
		return userDao.selectUserByName(userName);
	}

}
