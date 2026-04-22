package br.insper.conexoes.connections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserResponseTest {

    @Test
    void recordAccessorsShouldReturnValues() {
        UserResponse user = new UserResponse("1", "a@b.com", "Alice");
        assertEquals("1", user.id());
        assertEquals("a@b.com", user.email());
        assertEquals("Alice", user.name());
    }
}
