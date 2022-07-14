package com.Repo;

import java.util.ArrayList;

import com.entities.Electronics;
import com.entities.Furniture;

public class Repository {
	
	 public static ArrayList<Electronics> electronics_list1;
	 public static ArrayList<Furniture> furniture_list2;
	 
	 public static void data_Repo() {
		 
		 electronics_list1 = new ArrayList<Electronics>();
		 
		 Electronics b1 = new Electronics();
		 b1.setItem_id(1);
		 b1.setItem_name("Fan");
		 b1.setItem_price(1250);
		 b1.setItem_mfd("Jan/2021");
		 b1.setItem_doe("Jan/2023");
		 
		 Electronics b2 = new Electronics();
		 b2.setItem_id(2);
		 b2.setItem_name("AC");
		 b2.setItem_price(1232);
		 b2.setItem_mfd("Feb/2020");
		 b2.setItem_doe("Feb/2022");
		 
		 Electronics b3 = new Electronics();
		 b3.setItem_id(3);
		 b3.setItem_name("Mobile");
		 b3.setItem_price(1500);
		 b3.setItem_mfd("Oct/2020");
		 b3.setItem_doe("Oct/2022");
		 
		 electronics_list1.add(b1);
		 electronics_list1.add(b2);
		 electronics_list1.add(b3);
		 
		 furniture_list2 = new ArrayList<Furniture>();
		 
		 Furniture c1 = new Furniture();
		 c1.setItem_id(1);
		 c1.setItem_name("Chair");
		 c1.setItem_price(69);
		 c1.setItem_mfd("Sept/2022");
		 c1.setItem_doe("Sept/2024");
		 
		 Furniture c2 = new Furniture();
		 c2.setItem_id(2);
		 c2.setItem_name("Table");
		 c2.setItem_price(120);
		 c2.setItem_mfd("Aug/2022");
		 c2.setItem_doe("Aug/2024");
		 
		 Furniture c3 = new Furniture();
		 c3.setItem_id(3);
		 c3.setItem_name("iron");
		 c3.setItem_price(250);
		 c3.setItem_mfd("Dec/2022");
		 c3.setItem_doe("Dec/2024");
		 
		 furniture_list2.add(c1);
		 furniture_list2.add(c3);
		 furniture_list2.add(c3);
		 
		 
		 
	 }

}
