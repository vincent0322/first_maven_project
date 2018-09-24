package com.wzy.baseTest;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: SpringTestCase
 * 
 * @author wangzhongyi
 * @date 2018年8月3日 上午10:14:13
 * 
 */
// 指定bean注入的配置文件
@ContextConfiguration(locations = { "classpath:application.xml" })
// 使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestCase {

}
