package org.example.errorattributesdemoimperative;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DemoController {

    @GetMapping(value = "error", produces = MediaType.APPLICATION_JSON_VALUE)
    public void triggerError() {
        throw new RuntimeException("This is a runtime exception");
    }

}
