package com.java15.bank_rest.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private int id;
    private String firstName;
    private String surname;
    private String address;
    private String contact;
    private String username;
    private String password;
}
