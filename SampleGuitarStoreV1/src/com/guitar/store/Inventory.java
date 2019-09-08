package com.guitar.store;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	List<Guitar> guitars=new LinkedList<>();
	
	public void addGuitar(String serialNumber,double price,String builder,String model,String type,String backWood,String topWood) {
		
		Guitar newGuitar= new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
		guitars.add(newGuitar);
		
		
	}
	
	public Guitar getGuitar(String serialNumber) {
		
		for(Iterator<Guitar> i=guitars.iterator();i.hasNext();) {
			Guitar g=(Guitar)i.next();
			if(g.getSerialNumber().equals(serialNumber))
				return g;
		}
		
		return null;
		
	}
	
	public Guitar searchGuitar(Guitar customerSearch) {
		
		for(Iterator<Guitar> i=guitars.iterator();i.hasNext();) {
			Guitar matchingGuitar= (Guitar)i.next();
			
			
			System.out.println("Builder: "+matchingGuitar.getBuilder().toLowerCase()+"Customer Provided Builder: "+customerSearch.getBuilder().toLowerCase());
			
			if(!matchingGuitar.getBuilder().toLowerCase().equals(customerSearch.getBuilder().toLowerCase()))
				continue;
			
			System.out.println("Model: "+matchingGuitar.getModel().toLowerCase()+"Customer Provided Model: "+customerSearch.getModel().toLowerCase());
			
			if(!matchingGuitar.getModel().toLowerCase().equals( customerSearch.getModel().toLowerCase()))
				continue;
			
			System.out.println("Type: "+matchingGuitar.getType().toLowerCase()+"Customer Provided Type: "+customerSearch.getType().toLowerCase());
			if(!matchingGuitar.getType().toLowerCase().equals(customerSearch.getType().toLowerCase()))
				continue;
			
			System.out.println("BackWood: "+matchingGuitar.getBackWood().toLowerCase()+"Customer Provided backWood: "+customerSearch.getBackWood().toLowerCase());
			if(!matchingGuitar.getBackWood().toLowerCase().equals(customerSearch.getBackWood().toLowerCase()))
				continue;
			
			System.out.println("TopWood: "+matchingGuitar.getTopWood().toLowerCase()+"Customer Provided TopWood: "+customerSearch.getTopWood().toLowerCase());
			if(!matchingGuitar.getTopWood().toLowerCase().equals(customerSearch.getTopWood().toLowerCase()))
				continue;
			
			return matchingGuitar;
		}
		
		return null;
	}
}
