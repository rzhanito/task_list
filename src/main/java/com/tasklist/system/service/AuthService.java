package com.tasklist.system.service;

import com.tasklist.system.web.dto.auth.JwtRequest;
import com.tasklist.system.web.dto.auth.JwtResponse;

public interface AuthService {
    JwtResponse login(JwtRequest loginRequest);
    JwtResponse refresh(String refreshToken);
}
