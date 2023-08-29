package com.solar.edge.models;

// Normal Operating Cell Temperature
public class NOCT extends ATestingConditions {
	public NOCT(NOCTBuilder stcBuilder) {
		this.maxPower = stcBuilder.maxPower;
		this.maxSystemVoltage = stcBuilder.maxSystemVoltage;
		this.openCircuitVoltage = stcBuilder.openCircuitVoltage;
		this.shortCircuitCurrent = stcBuilder.shortCircuitCurrent;
		this.maxSeriesFuseRating = stcBuilder.maxSeriesFuseRating;
		this.moduleEfficiency = stcBuilder.moduleEfficiency;
	}
}
