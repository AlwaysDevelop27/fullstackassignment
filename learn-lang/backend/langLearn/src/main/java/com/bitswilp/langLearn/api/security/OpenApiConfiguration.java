package com.bitswilp.langLearn.api.security;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(contact = @Contact(
		name = "Learning Language", 
		email = "mumbai@learninglanguage.com", 
		url = "https://learninglanguage.com"), 
		description = "OpenApi documentation for language learning service", 
		title = "Learning Language", 
		version = "1.0", 
		license = @License(
				name = "Learning Language Licence", 
				url = "https://www.LearningLanguage.com/en/info/privacy-policy"), 
				termsOfService = "https://www.LearningLanguage.com/en/info/terms-of-use"), 
		servers = {
		@Server(description = "LOCAL Environment", url = "http://localhost:8087"),
		@Server(description = "PROD Environment", url = "https://LearningLanguage.com/") }, 
		security = {
				@SecurityRequirement(name = "bearerAuth") })
@SecurityScheme(
		name = "bearerAuth", 
		description = "JWT auth description", 
		scheme = "bearer", type = SecuritySchemeType.HTTP, 
		bearerFormat = "JWT", in = SecuritySchemeIn.HEADER)
public class OpenApiConfiguration {

}
