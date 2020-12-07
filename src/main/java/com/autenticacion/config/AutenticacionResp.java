package com.autenticacion.config;

import java.io.Serializable;

public class AutenticacionResp implements Serializable {

    private final String jwt;

    public AutenticacionResp(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }


}
