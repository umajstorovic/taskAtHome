package org.callidusCloud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
	private String name;
	private String description;
	
	public Event() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Event name: " + getName() + ", Description: "+ getDescription();
	}
}
