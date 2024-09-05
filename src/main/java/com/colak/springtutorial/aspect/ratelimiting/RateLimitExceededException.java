package com.colak.springtutorial.aspect.ratelimiting;

public class RateLimitExceededException extends RuntimeException {

    public RateLimitExceededException(String message) {
        super(message);
    }
}
