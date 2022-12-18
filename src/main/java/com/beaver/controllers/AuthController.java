package com.beaver.controllers;

import com.beaver.entities.User;
import com.beaver.payload.request.LoginRequest;
import com.beaver.payload.request.SignUpRequest;
import com.beaver.services.UserServiceI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private final UserServiceI userService;
    @PostMapping("/signing")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
        return userService.singIn(loginRequest);
    }

    @PostMapping("/signup")
    public User createUser(@RequestBody SignUpRequest signUpRequest) {
        return userService.createUser(signUpRequest);
    }
}
