package com.altran.transport.metric;

import java.util.List;

import io.prometheus.client.Collector;

public class ExporterRegister {

	private List<Collector> collectors;

    public ExporterRegister(List<Collector> collectors) {
        for (Collector collector : collectors) {
            collector.register();
        }
        this.collectors = collectors;
    }
    
}
