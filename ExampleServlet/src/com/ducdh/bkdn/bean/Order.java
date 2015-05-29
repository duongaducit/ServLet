package com.ducdh.bkdn.bean;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Order {
	private String idOrder;
	private String idCustomer;
	private String addReceive;
	private String timeReceive;
	private int moneyEx;
	private int numberOfGif;
	private int moneyFee;
	private boolean statusOrder;
	
	private HashMap<String, Integer> addressMap;

	public String getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(String idOrder) {
		this.idOrder = idOrder;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getAddReceive() {
		return addReceive;
	}

	public void setAddReceive(String addReceive) {
		this.addReceive = addReceive;
	}

	public String getTimeReceive() {
		return timeReceive;
	}

	public void setTimeReceive(String timeReceive) {
		this.timeReceive = timeReceive;
	}

	public int getMoneyEx() {
		return moneyEx;
	}

	public void setMoneyEx(int moneyEx) {
		this.moneyEx = moneyEx;
	}

	public int getNumberOfGif() {
		return numberOfGif;
	}

	public void setNumberOfGif(int numberOfGif) {
		this.numberOfGif = numberOfGif;
	}

	public int getMoneyFee() {
		return moneyFee;
	}

	public void setMoneyFee(int moneyFee) {
		this.moneyFee = moneyFee;
	}

	public boolean isStatusOrder() {
		return statusOrder;
	}

	public void setStatusOrder(boolean statusOrder) {
		this.statusOrder = statusOrder;
	}

	public Order(String idOrder, String idCustomer, String addReceive,
			String timeReceive, int numberOfGif,
			boolean statusOrder) {
		super();
		//Map
		addressMap = new HashMap<String, Integer>();
		addressMap.put("Hoa Khanh", 0);
		addressMap.put("Hai Chau", 5);
		addressMap.put("Cam Le", 3);
		addressMap.put("Thanh Khe", 7);
		//
		this.idOrder = idOrder;
		this.idCustomer = idCustomer;
		this.addReceive = addReceive;
		this.timeReceive = timeReceive;
		this.numberOfGif = numberOfGif;
		this.statusOrder = statusOrder;
		
		this.moneyFee = numberOfGif*75000;
		StringTokenizer map = new StringTokenizer(addReceive, "-");
		map.nextToken();
		this.moneyEx = 5000 * addressMap.get(map.nextElement());
	}

	public Order() {
		super();
	}

}
