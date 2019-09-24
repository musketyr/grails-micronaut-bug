package mnlib;

import com.agorapulse.micronaut.grails.GrailsMicronautBeanProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfiguration {

    @Bean
    GrailsMicronautBeanProcessor someProcessor() {
        return GrailsMicronautBeanProcessor
                .builder()
                .addByType(SomeService.class)
                .build();
    }

}
