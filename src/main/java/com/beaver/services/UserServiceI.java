package com.beaver.services;

import com.beaver.entities.User;
import com.beaver.payload.request.LoginRequest;
import com.beaver.payload.request.SignUpRequest;
import com.beaver.payload.response.UserInfoResponse;
import org.springframework.http.ResponseEntity;

public interface UserServiceI {
    User createUser(SignUpRequest signUpRequest);
    ResponseEntity<?> singIn(LoginRequest loginRequest);
}
