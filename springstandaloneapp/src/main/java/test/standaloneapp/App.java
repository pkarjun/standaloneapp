package test.standaloneapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.standaloneapp.dataconnection.BasicDataSource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Apllication Started !");

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BasicDataSource bds = (BasicDataSource) context.getBean("dataSource", BasicDataSource.class);
		bds.setDataSourceName("arjun");
		System.out.println(bds.getDataSourceName());
		
		BasicDataSource bds1 = (BasicDataSource) context.getBean("dataSource", BasicDataSource.class);
		System.out.println(bds1.getDataSourceName());
		System.out.println("Apllication ended !");

		/*
		 * Singleton : It returns a single bean instance per Spring IoC
		 * container.This single instance is stored in a cache of such singleton
		 * beans, and all subsequent requests and references for that named bean
		 * return the cached object.If no bean scope is specified in bean
		 * configuration file, default to singleton.
		 * 
		 * Prototype : It returns a new bean instance each time when requested.
		 * It does not store any cache version like singleton.
		 * 
		 * Request : It returns a single bean instance per HTTP request.
		 * 
		 * Session : It returns a single bean instance per HTTP session (User
		 * level session).
		 * 
		 * GlobalSession : It returns a single bean instance per global HTTP
		 * session. It is only valid in the context of a web-aware Spring
		 * ApplicationContext (Application level session).
		 */
	}
}
