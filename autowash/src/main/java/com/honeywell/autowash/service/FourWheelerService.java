package com.honeywell.autowash.service;

public class FourWheelerService implements Service{

	
	
	
	public int getEstimationTime(ServiceType serviceType) {
		if(serviceType.equals(ServiceType.regularService)){
			return 3;
		}
		return 0;
	}

	
	

}
