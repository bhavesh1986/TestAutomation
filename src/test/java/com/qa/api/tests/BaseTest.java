
package com.qa.api.tests;

import com.qa.api.clients.PostClient;

import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected PostClient postClient;

    @BeforeClass
    public void setUp() {

        postClient = new PostClient();

    }
}
