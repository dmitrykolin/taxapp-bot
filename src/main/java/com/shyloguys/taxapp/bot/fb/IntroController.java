package com.shyloguys.taxapp.bot.fb;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Component
@Path("/fb/intro")
public class IntroController {

    @GET
    @Produces("application/json")
    public String intro() {
        return "intro message";
    }

}
