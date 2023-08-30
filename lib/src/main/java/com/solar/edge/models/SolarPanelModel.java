package com.solar.edge.models;

import java.util.HashMap;
import java.util.Map;

public class SolarPanelModel {
	private String name;
	private String moduleType;
	private String manufacturer;
	
	private AdditionalInformation additionalInformation;
	private Dimensions dimensions;
	private STC stc;
	private NOCT noct;
	
	public SolarPanelModel(String name, String moduleType, String manufacturer) {
		this.name = name;
		this.moduleType = moduleType;
		this.manufacturer = manufacturer;
	}
	
	//SETTERS
	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}
	
	public void setSTC(STC stc) {
		this.stc = stc;
	}
	
	public void setNOCT(NOCT noct) {
		this.noct = noct;
	}
	
	public void setAdditionalInformation(AdditionalInformation additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
	
	// GETTERS
	/*
	 * This map returns main information about solar panel model.
	 * Keys are *name*, *moduleType* and *manufacturer*.
	 */
	public Map<String, String> getModelInfo() {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("name", this.name);
		map.put("moduleType", this.moduleType);
		map.put("manufacturer", this.manufacturer);
		
		return map;
	}
	
	public AdditionalInformation getAdditionalInformation() {
		return this.additionalInformation;
	}
	
	public Dimensions getDimensions() {
		return this.dimensions;
	}
	
	public STC getSTC() {
		return this.stc;
	}
	
	public NOCT getNOCT() {
		return this.noct;
	}
	
}
