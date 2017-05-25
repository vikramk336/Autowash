package com.honeywell.autowash.service;

public class FourWheelerService implements Service{
	
	public int getEstimationTime(ServiceType serviceType) {
		switch(serviceType){
		case regularService:
			return 3;
		case wash:
			return 1;
		case specialService:
			return 5;
		}
		return 0;
	}
	
	public int getCost(ServiceType serviceType){
		switch(serviceType){
		case regularService:
			return 5000;
		case wash:
			return 500;
		case specialService:
			return 1000;
		}
		return 0;
	}

	
	

}
