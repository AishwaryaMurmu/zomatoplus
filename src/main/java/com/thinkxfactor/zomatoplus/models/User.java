<<<<<<< HEAD
package com.thinkxfactor.zomatoplus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Long id;

	@Column(name = "name",unique=true)
	private String name;

	@Column(name = "type")
	private String type;

	@Column(name = "mobile")
	private String mobile;

	@Column(name = "address")
	private String address;

	@Column(name = "password")
	private String password;

	@Column(name = "landmark")
	private String landmark;

	@Column(name = "pincode")
	private String pincode;


	public User() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
=======
/*package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

public class User implements Serializable {
private String username;

public User(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public User() {
	
}
private String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
*/
package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

public class User implements Serializable {

private String username;
private String password;

public User() { 
	
}

public User(String username, String password) {
		this.username = username;
		this.password = password;
}

public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
}

>>>>>>> 3a60b1650377c214b6a105c85438bfddc1f8158d
