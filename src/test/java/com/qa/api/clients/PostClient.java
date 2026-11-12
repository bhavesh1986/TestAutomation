
package com.qa.api.clients;

import com.qa.api.models.Post;
import com.qa.api.spec.SpecFactory;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostClient {

    private static final String POSTS = "/posts";

    // GET request by ID
    public Response getPostById(int postId) {

        return given()
                .spec(SpecFactory.requestSpec())
                .pathParam("id", postId)
        .when()
                .get(POSTS + "/{id}");
    }

    // GET request using query parameter
    public Response getPostsByUserId(int userId) {

        return given()
                .spec(SpecFactory.requestSpec())
                .queryParam("userId", userId)
        .when()
                .get(POSTS);
    }

    // POST request
    public Response createPost(Post post) {

        return given()
                .spec(SpecFactory.requestSpec())
                .body(post)
        .when()
                .post(POSTS);
    }

    // PUT request
    public Response updatePost(int postId, Post post) {

        return given()
                .spec(SpecFactory.requestSpec())
                .pathParam("id", postId)
                .body(post)
        .when()
                .put(POSTS + "/{id}");
    }

    // DELETE request
    public Response deletePost(int postId) {

        return given()
                .spec(SpecFactory.requestSpec())
                .pathParam("id", postId)
        .when()
                .delete(POSTS + "/{id}");
    }
}
