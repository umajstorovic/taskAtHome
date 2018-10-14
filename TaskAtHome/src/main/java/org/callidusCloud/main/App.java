package org.callidusCloud.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.MessageFormat;

import org.callidusCloud.dto.City;
import org.callidusCloud.dto.Event;
import org.callidusCloud.dto.Response;
import org.callidusCloud.dto.ResponseEvents;
import org.callidusCloud.util.Constants;
import org.callidusCloud.util.PropertiesUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.web.client.RestTemplate;

public class App implements CommandLineRunner {

//	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}

	public void run(String... args) throws Exception {
		final PropertiesUtil prop = new PropertiesUtil();
		
		final RestTemplate restTemplate = new RestTemplate();
		final Response response = restTemplate.getForObject(prop.getUrl(), 
													  Response.class);
		
		final City[] cities = response.getResults();
		for(int i = 0; i < cities.length; i++) {
			System.out.println(cities[i].toString());
		}
		
	
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("\nEnter city id: ");
			String line;
			while((line = br.readLine()) != null) {
				if(line.matches(Constants.DIGIT_REGEX)) {
					final int id = Integer.parseInt(line);
					final City city = getCityForId(id, cities);
					if(city != null) {
						final String url = String.format(prop.getEventsUrl(),
												         city.getLon(), 
												         city.getLat());
						
						final ResponseEvents event = restTemplate.getForObject(url, 
																		 ResponseEvents.class);
						
						final Event[] events = event.getResults();
						for(int i = 0; i < events.length; i++) {
							System.out.println(events[i].toString());
						}
					}
					else {
						System.out.println("City with that id: (" + line + ") does not exist!");
					}
				} else {
					System.out.println("You must enter a number!");
				}
			}
	
		}
	}

	private City getCityForId(final int id, final City[] cities) {
		if (cities != null) {
			for (int i = 0; i < cities.length; i++) {
				if (cities[i].getId() == id)
					return cities[i];
			}
		}
		return null;
	}

}
