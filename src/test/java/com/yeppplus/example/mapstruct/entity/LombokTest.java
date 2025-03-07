package com.yeppplus.example.mapstruct.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LombokTest {

    @Test
    void lombokTest() {
        User user = new User();
        user.setName("Test User");
        user.setEmail("test@example.com");

        assertEquals("Test User", user.getName());
        assertEquals("test@example.com", user.getEmail());
    }
}
