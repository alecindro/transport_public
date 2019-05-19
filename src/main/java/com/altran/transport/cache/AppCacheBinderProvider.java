package com.altran.transport.cache;

import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.springframework.boot.actuate.metrics.cache.CacheMeterBinderProvider;
import org.springframework.stereotype.Component;

@Component
public class AppCacheBinderProvider implements CacheMeterBinderProvider<AppCacheMetricsWrapper> {

    @Override
    public MeterBinder getMeterBinder(AppCacheMetricsWrapper cache, Iterable<Tag> tags) {
        return new AppCacheMeterBinder(cache, tags);
    }

}
