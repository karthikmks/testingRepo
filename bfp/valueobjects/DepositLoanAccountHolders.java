package com.bfp.valueobjects;

public class DepositLoanAccountHolders {
	
	private String acct_holder_name;
	private String is_authorised;
	private String created_by;
	private String created_timestamp;
	private String modified_by;
	private String modified_timestamp;
	private String active_flag;
	
	
	public String getAcct_holder_name() {
		return acct_holder_name;
	}
	public void setAcct_holder_name(String acct_holder_name) {
		this.acct_holder_name = acct_holder_name;
	}
	public String getIs_authorised() {
		return is_authorised;
	}
	public void setIs_authorised(String is_authorised) {
		this.is_authorised = is_authorised;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_timestamp() {
		return created_timestamp;
	}
	public void setCreated_timestamp(String created_timestamp) {
		this.created_timestamp = created_timestamp;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public String getModified_timestamp() {
		return modified_timestamp;
	}
	public void setModified_timestamp(String modified_timestamp) {
		this.modified_timestamp = modified_timestamp;
	}
	public String getActive_flag() {
		return active_flag;
	}
	public void setActive_flag(String active_flag) {
		this.active_flag = active_flag;
	}
	
	
	
	//////////////////////
	
	<?xml version="1.0" encoding="UTF-8"?>
	<!--
		DOCTYPE web-app PUBLIC "-//Sun Microsystems, Inc.//DTD Web Application
		2.3//EN" "http://java.sun.com/dtd/web-app_2_3.dtd"
	-->

<web-app>

	<display-name>SME Portal</display-name>

	<description>SME Portal</description>

	<context-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>/WEB-INF/classes/ApplicationContext.xml
		</param-value>
	</context-param>

	<context-param>
		<param-name>log4jConfigLocation</param-name>
		<param-value>classpath:log4j.xml
		</param-value>
	</context-param>
	<context-param>
		<param-name>log4jExposeWebAppRoot</param-name>
		<param-value>false</param-value>
	</context-param>

	<!-- Http Flex Session attribute and binding listener support -->
	<listener>
		<listener-class>flex.messaging.HttpFlexSession
		</listener-class>
	</listener>

	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener
		</listener-class>
	</listener>
	<listener>
		<listener-class>org.springframework.web.util.Log4jConfigListener
		</listener-class>
	</listener>

	<welcome-file-list>
		<welcome-file>BenefitFund.html</welcome-file>
	</welcome-file-list>

	<servlet>
		<servlet-name>sme</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet
		</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>sme</servlet-name>
		<url-pattern>/spring/*</url-pattern>
	</servlet-mapping>
</web-app>


	
	

}
