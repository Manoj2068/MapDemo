package com.main;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PPPPPPPPPPPPPPP
		// This line is added on my develop branch
		
		Map<Integer, String> mp = new HashMap<>();
		mp.put(101, "Manoj");
		mp.put(102,"Hari");
		mp.put(103, "Shyam");
		System.out.println("@@@@@@@@@@@@@");
		for (Map.Entry<Integer,String> ee:mp.entrySet()) {
			System.out.println(ee.getKey()+"  "+ee.getValue());
		}
	}
}
