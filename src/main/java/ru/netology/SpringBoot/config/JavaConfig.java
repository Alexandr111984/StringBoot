package ru.netology.SpringBoot.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import ru.netology.SpringBoot.profile.DevProfile;
import ru.netology.SpringBoot.profile.ProductionProfile;
import ru.netology.SpringBoot.profile.SystemProfile;

@Configuration

public class JavaConfig {
    @Bean
    @ConditionalOnProperty("true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty("false")
    public SystemProfile prodProfile() {

        return new ProductionProfile();
    }
}
