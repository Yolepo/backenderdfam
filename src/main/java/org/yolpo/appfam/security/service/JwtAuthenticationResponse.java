package org.yolpo.appfam.security.service;

import org.yolpo.appfam.security.JwtUser;

import java.io.Serializable;

public class JwtAuthenticationResponse implements Serializable {

    private final String token;
    private final JwtUser user;

    public JwtAuthenticationResponse(String token, JwtUser user) {
        this.token = token;
        this.user = user;
    }

    public String getToken() {
        return this.token;
    }

    public JwtUser getUser() {
        return this.user;
    }
}
