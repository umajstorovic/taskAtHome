package org.callidusCloud.dto;


public class City {
	private String zip;
	private String country;
	private String localized_country_name;
	private double distance;
	private String city;
	private double lon;
	private int ranking;
	private int id;
	private int member_count;
	private double lat;

	public City() {
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(final String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(final String country) {
		this.country = country;
	}

	public String getLocalized_country_name() {
		return this.localized_country_name;
	}

	public void setLocalized_country_name(final String localized_country_name) {
		this.localized_country_name = localized_country_name;
	}

	public double getDistance() {
		return this.distance;
	}

	public void setDistance(final double distance) {
		this.distance = distance;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	public double getLon() {
		return this.lon;
	}

	public void setLon(final double lon) {
		this.lon = lon;
	}

	public int getRanking() {
		return this.ranking;
	}

	public void setRanking(final int ranking) {
		this.ranking = ranking;
	}

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public int getMember_count() {
		return this.member_count;
	}

	public void setMember_count(final int member_count) {
		this.member_count = member_count;
	}

	public double getLat() {
		return this.lat;
	}

	public void setLat(final double lat) {
		this.lat = lat;
	}

	@Override
	public String toString() {
		return "Name: " + getCity() + ", id: " + getId();
	}
}
