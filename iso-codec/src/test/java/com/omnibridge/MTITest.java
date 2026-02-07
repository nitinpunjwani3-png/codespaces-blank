package com.omnibridge.codec;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MTITest {
    @Test
    void shouldIdentifyAuthorizationCategory() {
        MTI mti = new MTI("0100");
        assertEquals("Authorization", mti.getCategory());
    }

    @Test
    void shouldThrowExceptionForInvalidMTI() {
        assertThrows(IllegalArgumentException.class, () -> new MTI("ABC1"));
    }
}