package br.insper.conexoes.connections;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertFalse;

class UserClientTest {

    @Test
    void userExistsShouldReturnFalseOnUnexpectedError() {
        UserClient client = new UserClient();
        ReflectionTestUtils.setField(client, "userUrl", "http://invalid.localhost.invalid:1");
        assertFalse(client.userExists("123"));
    }
}
