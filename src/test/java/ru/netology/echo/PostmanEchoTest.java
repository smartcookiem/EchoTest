package ru.netology.echo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    public void shouldReturnSendData() {

        given()
                .baseUri("https://postman-echo.com")
                .body("Good morning")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo ("Good morning"))

        ;
    }

    @Test
    public void shouldReturnSendData2() {

        given()
                .baseUri("https://postman-echo.com")
                .body("25/07/2023")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo ("25/07/2023"))

        ;
    }


}