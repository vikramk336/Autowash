package com.honeywell.autowash.servicestation;

import com.honeywell.autowash.customer.Vehicle;

public class ServiceStationFacory {
	
	public ServiceStation getserviceStation(Vehicle vehicleType){
		if (vehicleType==null)
			return null;
		if(vehicleType.equals("FourWheeler"))
		return new ServiceStation();
		return null;
		
	}

}
