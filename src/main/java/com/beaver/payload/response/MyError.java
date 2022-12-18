package com.beaver.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MyError {
    private int statusCode;
    private String message;
}
