package com.heimdallauth.server.authguard.models.kratos;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserInformation {
    private String userId;
    private String username;
    private String emailAddress;
    private String firstName;
    private String lastName;
    private String avatarUrl;
    private String phoneNumber;
    private List<String> roles;
}