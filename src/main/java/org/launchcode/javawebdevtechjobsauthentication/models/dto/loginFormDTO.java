package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;

public class loginFormDTO {

    @NotNull
    @NotBlank
    private String username;

    @NotNull
    @NotBlank
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
