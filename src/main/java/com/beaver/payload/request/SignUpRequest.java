package com.beaver.payload.request;

import lombok.Data;

import java.util.Set;

@Data
public class SignUpRequest {
    private String username;
    private String email;
    private String password;
}
