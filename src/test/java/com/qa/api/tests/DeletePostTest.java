
package com.qa.api.tests;

import org.testng.annotations.Test;

public class DeletePostTest extends BaseTest {

    @Test
    public void verifyDeletePost() {

        postClient.deletePost(1)
                .then()
                .statusCode(200);
    }
}
