package com.solar.edge.models;

// TODO: Add certificate as file also
public class SolarPanel {
	private SolarPanelModelInformation modelInformation;
	
	public SolarPanel(SolarPanelModelInformation model) {
		this.modelInformation = model;
	}
	
	/*
	private SolarPanel(Builder builder) {
		this.openCircuitVoltage = builder.openCircuitVoltage;
		this.optimumOperatingVoltage = builder.optimumOperatingVoltage;
		this.shortCircuitCurrent = builder.shortCircuitCurrent;
		this.optimumOperatingCurrent = builder.optimumOperatingCurrent;
		this.maximumPower = builder.maximumPower;
		this.operatingTemperatureMin = builder.operatingTemperatureMin;
		this.operatingTemperatureMax = builder.operatingTemperatureMax;
		this.powerTolerance = builder.powerTolerance;
		this.nominalVoltage = builder.nominalVoltage;
		this.maximumSeriesFuseRating = builder.maximumSeriesFuseRating;
		this.maximumSystemVoltage = builder.maximumSystemVoltage;
		this.moduleEfficiency = builder.moduleEfficiency;
	}
	*/
}
