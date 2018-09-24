package com.wzy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wzy.model.User;
import com.wzy.service.UserService;

/**
 * @ClassName: UserController
 * 
 * @author wangzhongyi
 * @date 2018-9-20 14:12:48
 * 
 */
@Controller
public class UserController {
	@Resource
	private UserService userService;

	@RequestMapping("/")
	public ModelAndView getIndex() {
		ModelAndView mav = new ModelAndView("index");
		User user = userService.selectUserByName("wangzy");
		mav.addObject("user", user);
		return mav;
	}
}
