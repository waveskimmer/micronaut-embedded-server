package com.example;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class EmbeddedServerTest {

    @Test
    void testItWorks() {
        EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer.class);
        assertNotNull(embeddedServer);
        int port = embeddedServer.getPort();
        System.out.println("Port is " + port);
    }
}
