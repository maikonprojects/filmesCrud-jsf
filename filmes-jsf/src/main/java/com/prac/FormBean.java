package com.prac;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "formBean", eager = true)
@SessionScoped
public class FormBean implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String userName;
	private String password;
	private String address;
	private boolean rememberMe;
	private List<String> favColors;
	private String reqParam;
	private String reqAttr;
	private String actionParam;
	private String propertyActionListner;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isRememberMe() {
		return rememberMe;
	}
	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
	public List<String> getFavColors() {
		return favColors;
	}
	public void setFavColors(List<String> favColors) {
		this.favColors = favColors;
	}
	public String getReqParam() {
		return reqParam;
	}
	public void setReqParam(String reqParam) {
		this.reqParam = reqParam;
	}
	public String getReqAttr() {
		return reqAttr;
	}
	public void setReqAttr(String reqAttr) {
		this.reqAttr = reqAttr;
	}
	public String getActionParam() {
		return actionParam;
	}
	public void setActionParam(String actionParam) {
		this.actionParam = actionParam;
	}
	public String getPropertyActionListner() {
		return propertyActionListner;
	}
	public void setPropertyActionListner(String propertyActionListner) {
		this.propertyActionListner = propertyActionListner;
	}
	
	
}