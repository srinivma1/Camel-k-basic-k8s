package org.example;

import org.apache.camel.builder.RouteBuilder;

public class CamelBasic extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:tick")
                .log("Hello World37!");
    }
}
