package com.altran.transport.configuration;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.altran.transport.cache.AppCacheMetricsWrapper;

@Configuration
@EnableCaching
public class CacheConfig extends CachingConfigurerSupport{

	@Value("#{'${app.cache-names}'.split(',')}")
	private List<String> cacheNames;
	
    @Bean
    @Override
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(cacheNames.stream().map(AppCacheMetricsWrapper::new).collect(Collectors.toList()));
        return cacheManager;
    }

}
