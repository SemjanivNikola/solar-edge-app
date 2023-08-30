package com.solar.edge.models;

import java.util.ArrayList;

public class PowerPlant {
	private int controllerAddress;
	private ArrayList<Sector> sectorList;
	
	public PowerPlant(final int address) {
		this.controllerAddress = address;
		this.sectorList = new ArrayList<Sector>();
	}
	
	public void addSector(Sector sector) {
		this.sectorList.add(sector);
	}
	
	public ArrayList<Sector> getSectorList() {
		return this.sectorList;
	}
	
	public int getControllerAddress() {
		return this.controllerAddress;
	}
}
