package com.ducdh.bkdn.dao;

import java.util.ArrayList;
import java.util.Date;

import com.ducdh.bkdn.bean.Customer;
import com.ducdh.bkdn.bean.Order;

public class ServiceDao {
	
	public ArrayList<Customer> initCustomer(){
		ArrayList<Customer> listCustomer = new ArrayList<Customer>();
		
		Customer tmpCustomer;
		tmpCustomer = new Customer("C00", "Duong Huu Duc", "0973180134", "Hoa Khanh");
		listCustomer.add(tmpCustomer);
		tmpCustomer = new Customer("C01", "Tran Dinh Thong", "0973180135", "Hoa Khanh 1");
		listCustomer.add(tmpCustomer);
		tmpCustomer = new Customer("C02", "Nguyen Quoc Su", "0973180136", "Hoa Khanh 2");
		listCustomer.add(tmpCustomer);
		tmpCustomer = new Customer("C03", "Tran Van Hoan", "0973180137", "Hoa Khanh 3");
		listCustomer.add(tmpCustomer);
		tmpCustomer = new Customer("C04", "Le Dang Nhat", "0973180138", "Hoa Khanh 4");
		listCustomer.add(tmpCustomer);
		
		return listCustomer;
	}
	
	public ArrayList<Order> initOrder(){
		ArrayList<Order> listOrder = new ArrayList<Order>();
		Order tmpOrder = new Order();
		tmpOrder = new Order("Od00", "C00", "111 Dong Ke-Hoa Khanh","30 07:30",3, false);
		listOrder.add(tmpOrder);
		tmpOrder = new Order("Od01", "C01", "121 Nguyen Tru-Hai Chau","23 15:30",5, false);
		listOrder.add(tmpOrder);
		tmpOrder = new Order("Od02", "C00", "111 Nguyen Tru-Hai Chau","29 14:30",2, true);
		listOrder.add(tmpOrder);
		tmpOrder = new Order("Od03", "C02", "10 Duy Tan-Thanh Khe","29 13:45",10, false);
		listOrder.add(tmpOrder);
		
		return listOrder;
	}
	
	public void deleteOrder(Order orderSelect,ArrayList<Order> listOrder){
		listOrder.remove(orderSelect);
	}
	
	public void deleteCustomer(Customer customerSelect, ArrayList<Customer> listCustomers){
		listCustomers.remove(customerSelect);
	}
	
	public void insertOrder(Order orderInsert, ArrayList<Order> listOrders){
		listOrders.add(orderInsert);
	}
	
	public void insertCustomer(Customer customerInsert, ArrayList<Customer> listCustomers){
		listCustomers.add(customerInsert);
	}
	
	public void changeStatus(String idOrder, ArrayList<Order> listOrder){
		for (int i = 0;i < listOrder.size();i++){
			if (idOrder.equals(listOrder.get(i).getIdOrder())){
				listOrder.get(i).setStatusOrder(true);
				System.out.println("change");
			}
		}
	}
}
