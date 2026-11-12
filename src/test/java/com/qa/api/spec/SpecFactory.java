
package com.qa.api.spec;

import com.qa.api.config.ConfigManager;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.http.ContentType.JSON;

public final class SpecFactory {

    private SpecFactory() {
    }

    public static RequestSpecification requestSpec() {

        return new RequestSpecBuilder()

                .setBaseUri(ConfigManager.get("base.uri"))

                .setContentType(JSON)

                .setAccept(JSON)

                .build();
    }
}
