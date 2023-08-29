package com.solar.edge.models;

public abstract class ATestingConditions {
	protected float maxPower; // W/Wp - Watt-peak - Pmax
	protected float maxSystemVoltage; // V - Volt
	protected float openCircuitVoltage; // V - Volt - Voc
	protected float shortCircuitCurrent; // A - Amper - Isc
	protected float maxSeriesFuseRating; //A - Amper - Imp - max current
	protected float moduleEfficiency; // %
	protected float optimumOperatingVoltage; // V - Volt - Vmp
	protected float optimumOperatingCurrent; // A - Amper - Imp
	protected float operatingTemperatureMin; // °C
	protected float operatingTemperatureMax; // °C
	protected float nominalVoltage; // V - Imp
	protected float powerTolerance; // % - +/-
	
	// SETTERS
	public void setMaximumPower(float maxPower) {
		this.maxPower = maxPower;
	}
	
	public void setMaximumSystemVoltage(float maxSystemVoltage) {
		this.maxSystemVoltage = maxSystemVoltage;
	}

	public void setOpenCircuitVoltage(float openCircuitVoltage) {
		this.openCircuitVoltage = openCircuitVoltage;
	}
	
	public void setShortCircuitCurrent(float shortCircuitCurrent) {
		this.shortCircuitCurrent = shortCircuitCurrent;
	}
	
	public void setMaximumSeriesFuseRating(float maximumSeriesFuseRating) {
		this.maxSeriesFuseRating = maximumSeriesFuseRating;
	}
	
	public void setModuleEfficiency(float moduleEfficiency) {
		this.moduleEfficiency = moduleEfficiency;
	}
	
	public void setOptimumOperatingVoltage(float optimumOperatingVoltage) {
		this.optimumOperatingVoltage = optimumOperatingVoltage;
	}
	
	public void setOptimumOperatingCurrent(float optimumOperatingCurrent) {
		this.optimumOperatingCurrent = optimumOperatingCurrent;
	}
	
	public void setOperatingTemperatureMin(float operatingTemperatureMin) {
		this.operatingTemperatureMin = operatingTemperatureMin;
	}
	
	public void setOperatingTemperatureMax(float operatingTemperatureMax) {
		this.operatingTemperatureMax = operatingTemperatureMax;
	}
	
	public void setNominalVoltage(float nominalVoltage) {
		this.nominalVoltage = nominalVoltage;
	}
	
	public void setPowerTolerance(float powerTolerance) {
		this.powerTolerance = powerTolerance;
	}
	
	// GETTERS
	public float getMaxPower() {
		return this.maxPower;
	}
	
	public float getMaximumSystemVoltage() {
		return this.maxSystemVoltage;
	}

	public float setOpenCircuitVoltage() {
		return this.openCircuitVoltage;
	}
	
	public float setShortCircuitCurrent() {
		return this.shortCircuitCurrent;
	}
	
	public float setMaximumSeriesFuseRating() {
		return this.maxSeriesFuseRating;
	}
	
	public float setModuleEfficiency() {
		return this.moduleEfficiency;
	}
	
	public float setOptimumOperatingVoltage() {
		return this.optimumOperatingVoltage;
	}
	
	public float setOptimumOperatingCurrent() {
		return this.optimumOperatingCurrent;
	}
	
	public float setOperatingTemperatureMin() {
		return this.operatingTemperatureMin;
	}
	
	public float setOperatingTemperatureMax() {
		return this.operatingTemperatureMax;
	}
	
	public float setNominalVoltage() {
		return this.nominalVoltage;
	}
	
	public float setPowerTolerance() {
		return this.powerTolerance;
	}
}
