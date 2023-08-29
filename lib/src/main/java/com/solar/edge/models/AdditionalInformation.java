package com.solar.edge.models;

public class AdditionalInformation {
	private short weight; // kg
	private byte weightTolerance = 1; // % - +/-
	private String certificate;
	
	private short maxWindLoad; // Pa - Pascal
	private short maxSnowLoad; // Pa - Pascal
	
	public AdditionalInformation(short weight, byte weightTolerance, String certificate) {
		this.weight = weight;
		this.weightTolerance = weightTolerance;
		this.certificate = certificate;
	}
	
	// SETTERS
	public void setMaxWindLoad(short maxWindLoad) {
		this.maxWindLoad = maxWindLoad;
	}
	
	public void setMaxSnowLoad(short maxSnowLoad) {
		this.maxSnowLoad = maxSnowLoad;
	}
	
	//GETTERS
	public short getWeight() {
		return this.weight;
	}
	
	public byte getWeightTolerance() {
		return this.weightTolerance;
	}
	
	public String getCertificate() {
		return this.certificate;
	}
	
	public short getMaxWindLoad() {
		return this.maxWindLoad;
	}
	
	public short getMaxSnowLoad() {
		return this.maxSnowLoad;
	}
	
}
