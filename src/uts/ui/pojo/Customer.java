package uts.ui.pojo;

import java.io.Serializable;

public class Customer implements Serializable {
	private String custNo;
	private String custLastName;
	private String genBrchCode;
	
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustLastName() {
		return custLastName;
	}
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}
	public String getGenBrchCode() {
		return genBrchCode;
	}
	public void setGenBrchCode(String genBrchCode) {
		this.genBrchCode = genBrchCode;
	}
	
}
