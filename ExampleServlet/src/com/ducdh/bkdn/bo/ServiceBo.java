package com.ducdh.bkdn.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

import com.ducdh.bkdn.bean.Customer;
import com.ducdh.bkdn.bean.Order;
import com.ducdh.bkdn.dao.ServiceDao;

public class ServiceBo {
	private ServiceDao daoService = new ServiceDao();

	public ArrayList<Customer> initCustomer() {
		return daoService.initCustomer();
	}

	public ArrayList<Order> initOrder() {

		return daoService.initOrder();
	}

	public void deleteOrder(Order orderSelect, ArrayList<Order> listOrder) {
		daoService.deleteOrder(orderSelect, listOrder);
	}

	public void deleteCustomer(Customer customerSelect,
			ArrayList<Customer> listCustomers) {
		daoService.deleteCustomer(customerSelect, listCustomers);
	}

	public void insertOrder(Order orderInsert, ArrayList<Order> listOrders) {
		daoService.insertOrder(orderInsert, listOrders);
	}

	public void insertCustomer(Customer customerInsert,
			ArrayList<Customer> listCustomers) {
		daoService.insertCustomer(customerInsert, listCustomers);
	}

	public void changeStatus(String idOrder, ArrayList<Order> listOrder) {
		daoService.changeStatus(idOrder, listOrder);
	}
	public int countTime(String dateEnd){
		int time = 0;
		Date date = new Date();
		int day = date.getDate();
		int hours = date.getHours();
		int mins = date.getMinutes();
		
		StringTokenizer timeEnd = new StringTokenizer(dateEnd," ");
		int dayEnd = Integer.parseInt(timeEnd.nextToken());
		String hEnd = timeEnd.nextToken();
		timeEnd = new StringTokenizer(hEnd,":");
		int housrEnd = Integer.parseInt(timeEnd.nextToken());
		int minsEnd = Integer.parseInt(timeEnd.nextToken());
		
		time = dayEnd*24*60 + housrEnd*60 +  minsEnd - (day*60*24 + hours*60 + mins);
		return time;
	}
}
