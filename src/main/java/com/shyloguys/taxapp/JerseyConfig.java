package com.shyloguys.taxapp;


import com.shyloguys.taxapp.bot.fb.IntroController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/bot/api")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(IntroController.class);
    }
}
