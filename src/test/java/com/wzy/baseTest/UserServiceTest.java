package com.wzy.baseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wzy.model.User;
import com.wzy.service.UserService;

/**
 * @ClassName: UserServiceTest
 * 
 * @author wangzhongyi
 * @date 2018年8月3日 上午10:14:48
 * 
 */
public class UserServiceTest extends SpringTestCase {
	private static String DRIVERNAME;
    private static String URL;
    private static String USER;
    private static String PASSWORD;
	
	@Autowired
	private UserService userService;

	@Test
	public void selectUserByNameTest() {
		User user = userService.selectUserByName("wangzy");
		System.out.println(user.getUserName() + ":" + user.getAge());
	}
	
	@Test
	public void jdbcConnectTest(){
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("src/main/resources/properties/jdbc.properties"));
//			InputStream input = UserServiceTest.class.getClassLoader().getResourceAsStream("properties/jdbc.properties");
//			properties.load(input);
			DRIVERNAME = properties.getProperty("jdbc_driverClassName");
			URL = properties.getProperty("jdbc_url");
			USER = properties.getProperty("jdbc_username");
			PASSWORD = properties.getProperty("jdbc_password");
			
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println(connection.isClosed());// 不可以通过isClosed true还是false来判断是否连接成功
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
