package com.solar.edge.models;

public class STCBuilder extends ATestingConditionsBuilder<STC> {
	
	public STCBuilder(float maxPower, float maxSystemVoltage, float openCircuitVoltage, float shortCircuitCurrent, float maxSeriesFuseRating, float moduleEfficiency) {
		this.maxPower = maxPower;
		this.maxSystemVoltage = maxSystemVoltage;
		this.openCircuitVoltage = openCircuitVoltage;
		this.shortCircuitCurrent = shortCircuitCurrent;
		this.maxSeriesFuseRating = maxSeriesFuseRating;
		this.moduleEfficiency = moduleEfficiency;
	}
	
	@Override
	public STC build() {
		return new STC(this);
	}
}
