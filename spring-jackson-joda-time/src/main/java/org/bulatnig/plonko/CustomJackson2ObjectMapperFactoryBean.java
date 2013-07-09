package org.bulatnig.plonko;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean;

public class CustomJackson2ObjectMapperFactoryBean extends Jackson2ObjectMapperFactoryBean {

    @Override
    public ObjectMapper getObject() {
        ObjectMapper objectMapper = super.getObject();
        objectMapper.registerModule(new JodaModule());
        return objectMapper;
    }
}
