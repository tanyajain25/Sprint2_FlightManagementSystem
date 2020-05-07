package org.cap.usermngt.entities;

import java.math.BigInteger;
import javax.persistence.*;

@Entity
@Table(name = "UserDetails")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "User_Id")
	private BigInteger userId;

	@Column(name = "User_Type")
	private String userType;

	@Column(name = "User_Name")
	private String userName;

	@Column(name = "User_Password")
	private String userPassword;

	@Column(name = "User_Phone_no")
	private BigInteger userPhone;

	@Column(name = "User_Email_Id")
	private String userEmail;

	public User() {
		super();
	}

	public User(BigInteger userId, String userType, String userName, String userPassword, BigInteger userPhone,
			String userEmail) {
		super();
		this.userId = userId;
		this.userType = userType;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
	}

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public BigInteger getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(BigInteger userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
