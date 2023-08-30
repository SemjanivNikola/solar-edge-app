package com.solar.edge.models;

public class Sector {
	private int controllerAddress;
	private short numOfPanels;
	private SolarPanelModel panelModel;
	private float illuminance;
	private float voltage;
	
	public Sector(final short numOfPanels, final SolarPanelModel model, final int address) {
		this.numOfPanels = numOfPanels;
		this.panelModel = model;
		this.controllerAddress = address;
	}
	
	public int getControllerAddress() {
		return this.controllerAddress;
	}
}
