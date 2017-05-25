package com.honeywell.autowash.servicestation;

import com.honeywell.autowash.service.ServiceType;

public abstract class ServiceStation {
	
	int slots;
	
	public abstract void performService(ServiceType st);
	
	public abstract void createSlots();
	
	public abstract int getSlots();
	
	

}
