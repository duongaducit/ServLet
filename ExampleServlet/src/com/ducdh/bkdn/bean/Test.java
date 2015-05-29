package com.ducdh.bkdn.bean;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> addressMap = new HashMap<String, Integer>();
		addressMap = new HashMap<String, Integer>();
		addressMap.put("Hoa Khanh", 0);
		addressMap.put("Hai Chau", 5);
		addressMap.put("Cam Le", 3);
		addressMap.put("Thank Khe", 7);

		System.out.println(addressMap.get("Hai Chau"));
	}

}
