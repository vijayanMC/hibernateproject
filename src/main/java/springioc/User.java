package springioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User {
    
	@Value("1")
	private int userid;
	
	@Value("ajay")
	private String username;
	
	@Value("123456789")
	private long contact;
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", contact=" + contact + "]";
	}
	


//
//	public User(int userid, String username, long contact) {
//		super();
//		this.userid = userid;
//		this.username = username;
//		this.contact = contact;
//	}


	
//	<!--    <bean id="user" class="springioc.User">
//    
//    <constructor-arg name="userid" value="1"></constructor-arg>
//    <constructor-arg name="username" value="ajay"></constructor-arg>
//    <constructor-arg name="contact" value="895674839"></constructor-arg>
//      
//      
//     </bean>
//     
//     <bean id="laptop" class="springioc.Laptop">
//     <constructor-arg name="lapid" value="1"></constructor-arg>
//    <constructor-arg name="lapbrand" value="apple"></constructor-arg>
//    <constructor-arg name="lapram" value="16"></constructor-arg>
//    <constructor-arg name="user" ref="user"></constructor-arg>
//    
//      
//     </bean> -->
	
	
}
