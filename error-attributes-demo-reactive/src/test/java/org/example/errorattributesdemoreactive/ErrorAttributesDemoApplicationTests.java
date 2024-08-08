package org.example.errorattributesdemoreactive;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
@AutoConfigureWebTestClient
class ErrorAttributesDemoApplicationTests {

    @Autowired
    WebTestClient webTestClient;

    @Test
    void errorAttributes() {
        webTestClient.get().uri("/api/error").exchange()
                .expectAll(
                        response -> response.expectStatus().is5xxServerError(),
                        response -> response.expectBody().jsonPath("message").isEqualTo("This is a runtime exception")
                );
    }

}
