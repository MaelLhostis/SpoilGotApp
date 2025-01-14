package com.fdorval.spoilgot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Configuration
public class JsonMapperConfiguration {
	  @Bean
      public Jackson2ObjectMapperBuilder objectMapperBuilder() {
          Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
          builder.serializationInclusion(Include.NON_NULL);
          return builder;
      }
}
