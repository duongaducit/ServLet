package com.ducdh.bkdn.bean;

public class Customer {

	private String idCustomer;
	private String nameCustomer;
	private String phoneCustomer;
	private String addCustomer;

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public String getPhoneCustomer() {
		return phoneCustomer;
	}

	public void setPhoneCustomer(String phoneCustomer) {
		this.phoneCustomer = phoneCustomer;
	}

	public String getAddCustomer() {
		return addCustomer;
	}

	public void setAddCustomer(String addCustomer) {
		this.addCustomer = addCustomer;
	}

	public Customer(String idCustomer, String nameCustomer,
			String phoneCustomer, String addCustomer) {
		super();
		this.idCustomer = idCustomer;
		this.nameCustomer = nameCustomer;
		this.phoneCustomer = phoneCustomer;
		this.addCustomer = addCustomer;
	}

	public Customer() {
		super();
	}

	
}
