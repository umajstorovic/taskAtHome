package org.callidusCloud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

	 @JsonProperty
	  private City[] results;
	  
	  public City[] getResults() {
	    return results;
	  }

	  public void setResults(final City[] results) {
	    this.results = results;
	  }

	  public Response(){
	  }

	  @Override
	  public String toString() {
	    return "Response [RestResponse=" + results + "]";
	  }
}
