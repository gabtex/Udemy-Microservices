package com.devsuperior.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //classe de configuração (Rest template) para "unir" o projeto worker com o payroll (Bean)
public class AppConfig {

    @Bean
    public RestTemplate restTemplate(){ //registra uma instância única(Singleton) e fica disponível para ser injetada em outros componentes
        return new RestTemplate();
    }
}
