package org.callidusCloud.util;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
    private Properties properties;

    public PropertiesUtil() throws IOException {
        properties = new Properties();
        properties.load(PropertiesUtil.class.getClassLoader().getResourceAsStream("url.properties"));
    }
    
    
    public String getUrl() {
    	return this.properties.getProperty(Constants.URL_CITIES);
    }
    
    public String getEventsUrl() {
    	return this.properties.getProperty(Constants.URL_EVENTS);
    }
}
