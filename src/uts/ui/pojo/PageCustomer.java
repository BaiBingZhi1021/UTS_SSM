package uts.ui.pojo;

import java.util.List;

public class PageCustomer {
	private int start;
	private int end;
	private int count;
	private String genBrchCode;
	private List<Customer> customerList;
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getGenBrchCode() {
		return genBrchCode;
	}
	public void setGenBrchCode(String genBrchCode) {
		this.genBrchCode = genBrchCode;
	}
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	
}
