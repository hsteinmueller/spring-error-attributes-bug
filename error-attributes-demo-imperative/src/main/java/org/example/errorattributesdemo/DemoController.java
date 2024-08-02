package org.example.errorattributesdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api")
public class DemoController {

    @GetMapping("/error")
    public void triggerError() {
        throw new RuntimeException("This is a runtime exception");
    }

}
