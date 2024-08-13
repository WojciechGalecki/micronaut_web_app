package wg.app.model;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record User(String name) {
}
