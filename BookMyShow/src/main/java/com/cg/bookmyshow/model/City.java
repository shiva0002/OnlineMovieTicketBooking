package com.cg.bookmyshow.model;

public class City {
	private String cityId;
	private String cityName;
	private String cityAddress;
public String getCityId() {
	return cityId;
}
public void setCityId(String cityId) {
	this.cityId = cityId;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public String getCityAddress() {
	return cityAddress;
}
public void setCityAddress(String cityAddress) {
	this.cityAddress = cityAddress;
}
@Override
public String toString() {
	return "City [cityId=" + cityId + ", cityName=" + cityName + ", cityAddress=" + cityAddress + "]";
}
 
 
}
