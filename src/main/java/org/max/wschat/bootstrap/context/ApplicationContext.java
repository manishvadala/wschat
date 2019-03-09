package org.max.wschat.bootstrap.context;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "org.max.wschat.api.repository")
@EntityScan(basePackages = "org.max.wschat.model")
@PropertySources(value = {
        @PropertySource("classpath:/config/application.properties")
})
public class ApplicationContext {

    ApplicationContext() {

    }

    /**
     * API spring configuration.
     */
    @Configuration
    @ComponentScan(basePackages = "org.max.wschat.api")
    static class APIContext {

        APIContext() {

        }
    }
}
