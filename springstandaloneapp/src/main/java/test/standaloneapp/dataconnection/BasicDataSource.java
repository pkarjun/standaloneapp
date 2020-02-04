package test.standaloneapp.dataconnection;

import java.sql.Connection;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class BasicDataSource {

	private String dataSourceName;
	
	private String url;
	
	private String username;
	
	private String password;
	
	private Connection con = null;
	
	

	/**
	 * @return the dataSourceName
	 */
	public String getDataSourceName() {
		return dataSourceName;
	}



	/**
	 * @param dataSourceName the dataSourceName to set
	 */
	public void setDataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
	}



	/**
	 * @return the con
	 */
	public Connection getCon() {
		return con;
	}



	/**
	 * @param con the con to set
	 */
	public void setCon(Connection con) {
		this.con = con;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}



	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}



	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}



	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

  /*  @PostConstruct
	public Connection getConnection() throws SQLException, ClassNotFoundException{
    	Class.forName(dataSourceName);
    	con = DriverManager.getConnection(url, username, password);
		return con;
	}
	
    @PreDestroy
	public void closeConnection() throws SQLException{
		if(!con.isClosed()){
			con.close();
		}
		
	}*/
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BasicDataSource [dataSourceName=" + dataSourceName + ", url=" + url + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
}
