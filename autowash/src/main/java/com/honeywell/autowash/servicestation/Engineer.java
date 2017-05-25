package com.honeywell.autowash.servicestation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Engineer {
	
	int enggId;
	String enggName;
	boolean available;
	
	Engineer(String name, int id, boolean available){
		this.enggId=id;
		this.enggName=name;
		this.available=true;
	}
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void checkList(int enggId, HashMap<Integer,Integer> enggMap){
		Iterator it = enggMap.entrySet().iterator();
		while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        int id = (Integer)pair.getKey();
	        int value = (Integer)pair.getValue();
	        if(id==enggId && value==0){
	        	setAvailable(false);
	        }
	        else{
	        	setAvailable(true);
	        }
	    }
	}
	
	
	

	
	
	

}
