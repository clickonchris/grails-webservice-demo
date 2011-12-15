package com.clickonchris.demo

import groovyx.net.ws.WSClient

class WebServiceClientFactory {
	
	private static WSClient weatherClient = null;
	
	public static WSClient getWeatherService() {
		
		if (this.weatherClient == null) {
			this.weatherClient = new WSClient("http://www.w3schools.com/webservices/tempconvert.asmx?WSDL", this.class.classLoader)
			weatherClient.initialize()
		}
		
		return this.weatherClient
		
	}

}
