package wg.app.controller;

import java.util.List;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Status;
import wg.app.model.User;

@Controller("/users")
public class UserController {

    @Get
    @Status(HttpStatus.OK)
    public List<User> getAllUsers() {
        var user = new User("John");
        return List.of(user);
    }
}
