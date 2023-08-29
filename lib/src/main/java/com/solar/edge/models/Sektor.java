package com.solar.edge.models;

import java.util.ArrayList;

public class Sektor {
	private short numOfPanels;
	private ArrayList<SolarPanel> solarPanel;
	
	public Sektor(short numOfPanels) {
		this.numOfPanels = numOfPanels;
	}
}
