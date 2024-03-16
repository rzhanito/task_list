package com.tasklist.system.service.impl;

import com.tasklist.system.service.AuthService;
import com.tasklist.system.web.dto.auth.JwtRequest;
import com.tasklist.system.web.dto.auth.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
