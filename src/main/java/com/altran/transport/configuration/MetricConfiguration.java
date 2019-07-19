package com.altran.transport.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.altran.transport.metric.ExporterRegister;

import io.prometheus.client.Collector;
import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.exporter.MetricsServlet;

@Configuration
@ConditionalOnClass(CollectorRegistry.class)
public class MetricConfiguration {

	 private static final CollectorRegistry metricRegistry = CollectorRegistry.defaultRegistry;
	 
	   @Bean
	    ServletRegistrationBean registerPrometheusExporterServlet() {
	        return new ServletRegistrationBean(new MetricsServlet(metricRegistry), "/metrics");
	    }
	   
	   @Bean
	    ExporterRegister exporterRegister() {
	        List<Collector> collectors = new ArrayList<>();
	        ExporterRegister register = new ExporterRegister(collectors);
	        return register;
	    }

}
