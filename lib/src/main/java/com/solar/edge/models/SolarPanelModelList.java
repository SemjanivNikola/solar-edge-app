package com.solar.edge.models;

import java.util.ArrayList;

public class SolarPanelModelList {
	private static ArrayList<SolarPanelModel> list;
	
	private SolarPanelModelList () {}
	
	public static void addPanelModel(SolarPanelModel panelModel) {
		list.add(panelModel);
	}
	
	public static ArrayList<SolarPanelModel> getPanelModelList() {
		return list;
	}
}
