package wg.app.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.json.tree.JsonNode;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;

@MicronautTest
public class UserControllerTest {

    @Inject
    @Client("/users")
    HttpClient httpClient;

    @Test
    void When_Get_Expect_ProperResponse() {
        var response = httpClient.toBlocking().exchange("/", JsonNode.class);

        assertEquals(HttpStatus.OK, response.status());
        assertEquals(1, response.body().size());
    }
}
