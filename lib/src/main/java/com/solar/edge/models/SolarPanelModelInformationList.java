package com.solar.edge.models;

import java.util.ArrayList;

public class SolarPanelModelInformationList {
	private static ArrayList<SolarPanelModelInformation> list;
	
	private SolarPanelModelInformationList () {}
	
	public static void addPanelModel(SolarPanelModelInformation panelModel) {
		list.add(panelModel);
	}
	
	public static ArrayList<SolarPanelModelInformation> getPanelModelList() {
		return list;
	}
}
