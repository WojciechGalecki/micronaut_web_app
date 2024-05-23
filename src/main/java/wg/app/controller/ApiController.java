package wg.app.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/test")
public class ApiController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String get() {
        return "test";
    }
}
