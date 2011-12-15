package grails.ws.demo

import com.clickonchris.demo.WebServiceClientFactory;

import groovyx.net.ws.WSClient


class WeatherController {

	def index = {
		def message

        if (params?.value && params.from) {
		
			def proxy = WebServiceClientFactory.getWeatherService()
            def result
			def to_units
            if ("Celcius".equals(params.from)) {
                result = proxy.CelsiusToFahrenheit(params.value)
				to_units =  "F"
            } else {
                result = proxy.FahrenheitToCelsius(params.value)
				to_units = "C"
            }
            message = "${params.value} degrees ${params.from} is ${result} degrees ${to_units}"
        }

        flash.message = message
	}
}
