package com.heimdallauth.server.authguard.dto;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateUserDTO {
    private String userEmail;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String userTzOffset;
}
