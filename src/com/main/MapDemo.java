package com.main;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello java @@@@@@@@@@ ");
		Map<Integer, String> mp = new HashMap<>();
		mp.put(101, "Manoj");
		mp.put(102,"Hari");
		mp.put(103, "Shyam");
		System.out.println("@@@@@@@@@@@@@");
		for (Map.Entry<Integer,String> ee:mp.entrySet()) {
			System.out.println(ee.getKey()+"  "+ee.getValue());
		}
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("The project on feature/bugfix branch");
		System.out.println("hello java");
		}
}
