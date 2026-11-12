
package com.qa.api.tests;

import com.qa.api.models.Post;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class UpdatePostTest extends BaseTest {

    @Test
    public void verifyUpdatePost() {

        Post updateBody = new Post(
                1,
                "Updated title",
                "Updated body"
        );

        postClient.updatePost(1, updateBody)
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("Updated title"))
                .body("body", equalTo("Updated body"));
    }
}
