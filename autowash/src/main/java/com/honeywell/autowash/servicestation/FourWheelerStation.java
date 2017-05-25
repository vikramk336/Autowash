package com.honeywell.autowash.servicestation;

import com.honeywell.autowash.service.ServiceType;

public class FourWheelerStation extends ServiceStation  {

	
	
	Engineer e1 = new Engineer("Ram",100,true);
	Engineer e2 = new Engineer("Sham",200,true);
	Engineer e3 = new Engineer("Krishna",300,true);
	Engineer e4 = new Engineer("Raj",400,true);
	Engineer e5 = new Engineer("Rohit",500,true);
	 
	@Override
	public void performService(ServiceType serviceType) {
		switch(serviceType){
		case regularService:
			slots=slots-3;
		case wash:
			slots=slots-1;
		case specialService:
			slots=slots-5;
		}
	}
	
	@Override
	public void createSlots() {
		slots=10;
	}

	@Override
	public int getSlots() {
		return slots;
	}

}
