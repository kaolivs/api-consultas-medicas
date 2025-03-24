package com.senai.karenoliveira.consultasmedicas.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("API de Consultas Médicas")
                .description("Documentação da API de Agendamento de Consultas Médicas")
                .version("1.0"));
    }
}
