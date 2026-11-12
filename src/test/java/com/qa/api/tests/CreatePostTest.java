
package com.qa.api.tests;

import com.qa.api.models.Post;

import io.restassured.response.Response;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class CreatePostTest extends BaseTest {

    @Test
    public void verifyCreatePost() {

        Post requestBody = new Post(
                1,
                "Learning Rest Assured",
                "Creating a post using POM framework"
        );

        Response response = postClient.createPost(requestBody);

        response.then()
                .statusCode(201)
                .body("id", notNullValue())
                .body("userId", equalTo(1))
                .body("title", equalTo("Learning Rest Assured"))
                .body("body",
                      equalTo("Creating a post using POM framework"));
    }
}
