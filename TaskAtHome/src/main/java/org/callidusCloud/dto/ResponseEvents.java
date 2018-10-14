package org.callidusCloud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseEvents {

	 @JsonProperty
	  private Event[] events;
	  
	  public Event[] getResults() {
	    return events;
	  }

	  public void setResults(final Event[] events) {
	    this.events = events;
	  }

	  public ResponseEvents(){
	  }

	  @Override
	  public String toString() {
	    return "Response [RestResponse=" + events + "]";
	  }
}
