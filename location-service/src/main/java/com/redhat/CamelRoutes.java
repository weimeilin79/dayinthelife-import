package com.redhat;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.redhat.processor.ResultProcessor;

@Component
public class CamelRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		ResultProcessor resultProcessor = new ResultProcessor();
		
		restConfiguration()
			.component("undertow")
        	.port(8080)
        	.bindingMode(RestBindingMode.json)
			.contextPath("/")
        	.dataFormatProperty("prettyPrint", "true")
        	.enableCORS(true)
        	.apiContextPath("/api-doc")
        	.apiProperty("api.title", "Location API")
        	.apiProperty("api.version", "1.0.0")
        ;
		
		

		
		
		

	
	}
	
	

}
