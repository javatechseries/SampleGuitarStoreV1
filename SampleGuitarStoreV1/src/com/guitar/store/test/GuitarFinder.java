package com.guitar.store.test;


import com.guitar.store.Guitar;
import com.guitar.store.Inventory;

public class GuitarFinder {

	public static void main(String[] args) {
	
		Inventory inventory = new Inventory();
		
		initializeInventory(inventory);
		
		Guitar customerPref= new Guitar("",0,"Fender","Sterocast","Electric","Wood1","Wood2");
		
		Guitar matchedGuitar=inventory.searchGuitar(customerPref);
		
		if(matchedGuitar!=null){
			
			System.out.println("Dear Customer, you might like the Guitar with the below options");
			
			System.out.println("Builder : "+matchedGuitar.getBuilder());
			System.out.println("Model : "+matchedGuitar.getModel());
			System.out.println("Type : "+matchedGuitar.getType());
			System.out.println("BackWood : "+matchedGuitar.getBackWood());
			System.out.println("TopWood : "+matchedGuitar.getTopWood());
			
			System.out.println("for the price just "+matchedGuitar.getPrice());
			
		}
		else {
			System.out.println("Dear customer, no Guitars found with your search criteria");
		}

	}
	
	private static void initializeInventory(Inventory inventory) {
		
			
		inventory.addGuitar("V978677",1234.45,"Fender","Sterocast","Electric","Wood1","Wood2");
		inventory.addGuitar("V978634",1344.45,"Fender","Sterocast","Electric","Wood1","Wood2");
		
			
	}

}
