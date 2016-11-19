package com.ledzedev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Código generado por Gerado Pucheta Figueroa
 * Twitter: @ledzedev
 * http://ledze.mx
 * 16/Nov/2016.
 */
@EnableConfigServer
@SpringBootApplication
public class LedzedevConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LedzedevConfigServerApplication.class, args);
	}
}
