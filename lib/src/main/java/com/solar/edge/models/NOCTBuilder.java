package com.solar.edge.models;

public class NOCTBuilder extends ATestingConditionsBuilder<NOCT> {
	
	public NOCTBuilder(float maxPower, float maxSystemVoltage, float openCircuitVoltage, float shortCircuitCurrent, float maxSeriesFuseRating, float moduleEfficiency) {
		this.maxPower = maxPower;
		this.maxSystemVoltage = maxSystemVoltage;
		this.openCircuitVoltage = openCircuitVoltage;
		this.shortCircuitCurrent = shortCircuitCurrent;
		this.maxSeriesFuseRating = maxSeriesFuseRating;
		this.moduleEfficiency = moduleEfficiency;
	}
	
	@Override
	public NOCT build() {
		return new NOCT(this);
	}
}
