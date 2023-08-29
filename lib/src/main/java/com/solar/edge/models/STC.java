package com.solar.edge.models;

// Standard Test Conditions
public class STC extends ATestingConditions {
	public STC(STCBuilder stcBuilder) {
		this.maxPower = stcBuilder.maxPower;
		this.maxSystemVoltage = stcBuilder.maxSystemVoltage;
		this.openCircuitVoltage = stcBuilder.openCircuitVoltage;
		this.shortCircuitCurrent = stcBuilder.shortCircuitCurrent;
		this.maxSeriesFuseRating = stcBuilder.maxSeriesFuseRating;
		this.moduleEfficiency = stcBuilder.moduleEfficiency;
	}
}
