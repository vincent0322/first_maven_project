package com.wzy.baseTest;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: SpringTestCase
 * 
 * @author wangzhongyi
 * @date 2018��8��3�� ����10:14:13
 * 
 */
// ָ��beanע��������ļ�
@ContextConfiguration(locations = { "classpath:application.xml" })
// ʹ�ñ�׼��JUnit @RunWithע��������JUnitʹ��Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestCase {

}
