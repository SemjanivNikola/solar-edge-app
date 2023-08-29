package com.solar.edge.models;

/*
 * @description This abstraction is used just for builders. Required fields are defined as mandatory parameters in
 * constructor instance of this abstract class. Moreover, optional fields could be set through setters.
 * Setters are implemented because all instances use this methods in a same way.
 */
public abstract class ATestingConditionsBuilder<T> {
	// Required
	protected float maxPower;
	protected float maxSystemVoltage;
	protected float openCircuitVoltage;
	protected float shortCircuitCurrent;
	protected float maxSeriesFuseRating;
	protected float moduleEfficiency;
	
	// Optional
	protected float optimumOperatingVoltage;
	protected float optimumOperatingCurrent;
	protected float operatingTemperatureMin;
	protected float operatingTemperatureMax;
	protected float nominalVoltage;
	protected float powerTolerance;
	
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
	
	public void setPowerTolerance(float powerTolerance) {
		this.powerTolerance = powerTolerance;
	}
	
	public void setNominalVoltage(float nominalVoltage) {
		this.nominalVoltage = nominalVoltage;
	}
	
	public T build() { return null; }
}
