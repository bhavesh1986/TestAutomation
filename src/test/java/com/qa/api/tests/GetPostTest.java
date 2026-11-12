
package com.qa.api.tests;

import io.restassured.response.Response;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class GetPostTest extends BaseTest {

    @Test
    public void verifyGetPostById() {

        Response response = postClient.getPostById(1);

        response.then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("userId", equalTo(1))
                .body("title", not(emptyString()))
                .body("body", not(emptyString()));
    }

    @Test
    public void verifyGetPostsByUserId() {

        Response response = postClient.getPostsByUserId(1);

        response.then()
                .statusCode(200)
                .body("size()", greaterThan(0))
                .body("userId", everyItem(equalTo(1)));
    }
}
