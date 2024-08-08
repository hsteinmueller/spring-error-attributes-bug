package org.example.errorattributesdemoreactive;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.reactive.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;

import java.util.Map;

@Component
public class CustomErrorAttributes extends DefaultErrorAttributes {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CustomErrorAttributes.class);

    @Override
    public Map<String, Object> getErrorAttributes(ServerRequest request, ErrorAttributeOptions options) {
        final Map<String, Object> errorAttributes = super.getErrorAttributes(request, options);

        log.info("ErrorAttributes: {}", errorAttributes);
        log.info("Options: {}", options.getIncludes());

        return errorAttributes;
    }

}
