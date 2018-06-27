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

