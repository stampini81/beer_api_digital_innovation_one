package one.digitalinnovation.beerstock.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Beer Stock API",
                description = "REST API for beer stock management",
                version = "1.0.0",
                contact = @Contact(
                        name = "Rodrigo Peleias",
                        url = "https://gtihub.com/rpeleias",
                        email = "rodrigo.peleis@gmail.com"
                )
        )
)
public class SwaggerConfig {
    @Bean
    public String openApiMarkerBean() {
        return "openapi";
    }
}
