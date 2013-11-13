package com.bfp.valueobjects;

/**
 * @author tiruppathir
 *
 */
public class UserProfile {

	private String userId;
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	private String userName;
	private String password;
	private String role;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		if(this != null) {
			return "User Id : " + this.userId + " User Name : " + this.userName + " Role : " + this.role;
		} else {
			return null;
		}
	}
	
	/**
	 * @param obj
	 * @return
	 */
	public boolean equals(UserProfile obj) {
		boolean compare = false;
		if(this != null && obj != null) {
			if(obj instanceof UserProfile) {
				UserProfile profile = (UserProfile) obj;
				if(this.userId.equals(profile.role))
					compare = true;
			}
		}
		return compare;
	}
}