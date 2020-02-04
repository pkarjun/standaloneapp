package test.standaloneapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.standaloneapp.dataconnection.BasicDataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Apllication Started !" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BasicDataSource bds = (BasicDataSource) context.getBean("dataSource", BasicDataSource.class);
        System.out.println(bds.getDataSourceName()); 
        System.out.println( "Apllication ended !" );
    }
}
