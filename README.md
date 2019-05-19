# Basic Web app using Spring boot 2

# Build Docker Image File

mvn package docker:build

# Run Docker Image

docker run -p 8080:8080 -t transport_public/transport_public

# Rest Api

http://localhost:8080/api/datasets/v1

Parameters:
- query: a string value to filter the datasets. Default: empty. Not required;
- language: a string value to filter the dataset. Possible values: ca (Catalan) ,en (English) ,es (Spanish);
  Default: Catalan. Not required; 
- row: a number that filter the size from the datasets. 
  Default: 10 (configured in application.properties) 
- page:  a number that filter the pagination  from the datasets.

Example: http://localhost:8080/api/datasets/v1?query=barcelona&rows=10&page=1;

# Auditing and tracing

In the log write long time access to http://opendata-ajuntament.barcelona.cat/data/api/3/action/package_search.
This is defined in com.altran.transport.interceptor package and the configuration in com.altran.transport.configuration.AopConfig

# Default Metrics

Based in Actuator, the metrics are exposed in  http://localhost:8080/actuator

# Health check

To access the Health check: http://localhost:8080/actuator/health

# Web Container

Configured Undertow as the embedded server.

# Cache

Cache is configured in memory and binder with metrics.

# Custom Metrics

Created in http://localhost:8080/metrics. The metric "http_response_time_milliseconds" is a custom metric for requests to application.


# Some Improvements

Cache System: the actual cache is on memory. Change to a more consistent cache such as EhCache or Hazelcast por example.

Log: configure properly the log system.

Docker: configure Docker to "dual layer" approach, with library dependencies and application are publish in separate layers.

API Rest: to implement all parameters defined in https://opendata-ajuntament.barcelona.cat/data/api/3/action/help_show?name=package_search.


