package org.example.errorattributesdemoimperative;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Component
public class CustomErrorAttributes extends DefaultErrorAttributes {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CustomErrorAttributes.class);

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest request, ErrorAttributeOptions options) {
        final Map<String, Object> errorAttributes = super.getErrorAttributes(request, options);

        log.info("ErrorAttributes: {}", errorAttributes);
        log.info("Options: {}", options.getIncludes());

        return errorAttributes;
    }

}
